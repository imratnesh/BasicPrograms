/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.myjdbc;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class StudentJDBCTemplate implements StudentDAO{

    private DataSource ds;
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall jdbcCall;
    
    @Override
    public void setDataSource(DataSource ds) {
        this.ds=ds;
        this.jdbcTemplate =new JdbcTemplate(ds);
        this.jdbcCall = new SimpleJdbcCall(ds)
                .withProcedureName("getRecord");
    }

    @Override
    public void create(String name, Integer age) {
        String sql ="insert into student (name, age) values (?, ?)";
        jdbcTemplate.update(sql, name,age);
        System.out.println("Created Record Name= " + name + " Age= " +age);
       
    }

   
    @Override
        public Student getStudent(Integer id) {
//        String sql= "select * from Student where id=?";
//        Student student=jdbcTemplate.queryForObject(sql, new Object[]{id},new StudentMapper());
//        System.out.println("Details of student with id " + id);
        
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String,Object> out = jdbcCall.execute(in);
        
        Student student = new Student();
        student.setId(id);
        student.setName((String)out.get("out_name"));
        student.setAge((Integer)out.get("out_age"));        
         return student;
    }

    @Override
    public void updateStudent(Integer id, Integer age) {
        
    }

    @Override
    public void delete(Integer id) {
        String sql ="delete from student where id=?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleting record of id: "+ id);
        
        
    }

    @Override
    public List<Student> listStudents() {
       
        String sql="select * from Student";
       List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        
                
        return students;
        
    }
    
}

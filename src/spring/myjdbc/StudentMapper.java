/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.myjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class StudentMapper implements RowMapper<Student>{
    
   

    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student= new Student();
        student.setName(rs.getString("name"));
        student.setId(rs.getInt("id"));
        student.setAge(rs.getInt("age"));
        
        return student;
        
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.myjdbc;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Ratnesh Kushwaha
 */
public interface StudentDAO {
    
    public void setDataSource(DataSource ds);
    
    public void create(String name, Integer age);
    
    public Student getStudent(Integer id);
    public void updateStudent(Integer id, Integer age);
    
    public void delete(Integer id);
   
    public  List<Student> listStudents();
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.myjdbc;

import java.util.List;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class MainApp {
    
    public static void main (String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_6.xml");
        StudentJDBCTemplate sjt = (StudentJDBCTemplate) context.getBean("studentJdbcTemplate");
        
        System.out.println("----------Insert Students-------------");
//        sjt.create("Rohit",25 );
//        sjt.create("Neeraj",27);
//        sjt.create("Rashmi",24);
        
        
        System.out.println("-----------List Students--------------");
        List<Student> students = sjt.listStudents();
        
        for(Student stud: students)
        {
            System.out.println("Id: "+stud.getId());
            System.out.println("Name: "+stud.getName());
            System.out.println("Age: "+stud.getAge());
        }
        sjt.delete(4);
        
        Student student=sjt.getStudent(6);
        System.out.println("Name: "+student.getName());
        System.out.println("Id: "+ student.getId());
        System.out.println("Age: "+ student.getAge());
    }
    
}

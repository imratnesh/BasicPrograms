/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class MainApp {
    
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_4.xml");
        Student stud =(Student) context.getBean("student");
        System.out.println("Name is " + stud.getName());
        System.out.println("Age is "+stud.getAge());
//        TextEditor te  = (TextEditor) context.getBean("textEditor");
//        te.spellcheck();
        
    }
}

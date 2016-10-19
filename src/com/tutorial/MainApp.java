/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Ratnesh Kushwaha
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage1();
        obj.getMessage2();
        HelloIndia obj1= (HelloIndia)context.getBean("helloIndia");
        obj1.getMessage1();
        obj1.getMessage2();
        obj1.getMessage3();
    context.registerShutdownHook();
}
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Values.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class MainApp {
    public static void main (String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_3.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        jc.getCountryList();
        jc.getCountrySet();
        jc.getCountryMap();
        jc.getCountryProperties();
        
    }
    
}

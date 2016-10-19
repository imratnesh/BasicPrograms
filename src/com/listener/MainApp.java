/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class MainApp {
    public  static void main(String args[])
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans_5.xml");
        context.start();
//        HelloWorld hw =(HelloWorld) context.getBean("helloWorld");
//        hw.getMessage();
        
        
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
        
        context.stop();
        
    }
}

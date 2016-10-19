/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DItutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class MainApp {
    public static void main (String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_1.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellcheck();
    }
    
}

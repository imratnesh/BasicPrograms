/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>{

    @Override
    public void onApplicationEvent(CustomEvent e) {
        System.out.println("My message "+e.toString()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

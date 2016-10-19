/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CStartEventListener implements ApplicationListener<ContextStartedEvent>{

    @Override
    public void onApplicationEvent(ContextStartedEvent e) {
        System.out.println("Application context started");
    }
    
    
}

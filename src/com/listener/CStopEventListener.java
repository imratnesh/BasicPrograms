/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import sun.applet.AppletListener;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CStopEventListener implements ApplicationListener<ContextStoppedEvent>
{

    @Override
    public void onApplicationEvent(ContextStoppedEvent e) {
        System.out.println("Application context stopped");    
    }
    
}

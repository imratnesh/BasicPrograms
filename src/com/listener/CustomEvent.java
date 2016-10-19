/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CustomEvent extends ApplicationEvent
{

    public CustomEvent(Object source) {
        super(source);
    }
    public String toString()
    {
        return "Hello custom event";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class HelloWorld {
    private String msg;
    
    public void setMessage(String msg)
    {
        this.msg=msg;
    }
    public void getMessage()
    {
        System.out.println("Message :"+ msg);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class HelloIndia {
    private String message1;
    private String message3;
    private String message2; 
    public void setMessage1 (String message)
    {
        this.message1=message;
    }
    public void getMessage1 ()
    {
        System.out.println("HelloIndia Message1 : " + message1);
    }
    public void setMessage2 (String message)
    {
        this.message2=message;
    }
    public void getMessage2 ()
    {
        System.out.println("HelloIndia Message2 : " + message2);
    }
    
    public void setMessage3 (String message)
    {
            this.message3=message;
    }
    public void getMessage3 ()
    {
       System.out.println("HelloIndia Message3 : " + message3);
    }
    public void init()
    {
        System.out.println("Bean going through HelloIndia init");
    }
    public void destroy()
    {
        System.out.println("Bean going through HelloIndia destroy");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Student {
    private Integer age;
    private String name;

    //@Required
    @Autowired(required = false)
   public void setAge(Integer age)
    {
        this.age=age;
    }
    public Integer getAge() {
        //To change body of generated methods, choose Tools | Templates.
        return age;
    }
    
    //@Required
    @Autowired
     public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName() {
        
        return name;
    }

    
    
}

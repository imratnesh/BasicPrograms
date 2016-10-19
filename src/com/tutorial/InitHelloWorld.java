/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class InitHelloWorld implements BeanPostProcessor{
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
    {
        System.out.println("Before Initialization " +beanName);
        return bean;
    }
    @Override
     public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        System.out.println("After Initialization " +beanName);
        return bean;
    }
}

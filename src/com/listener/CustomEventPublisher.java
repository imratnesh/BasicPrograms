/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;


/**
 *
 * @author Ratnesh Kushwaha
 */
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
private ApplicationEventPublisher publisher;

@Override
public void setApplicationEventPublisher(ApplicationEventPublisher publisher){
this.publisher = publisher;
}

public void publish() {
CustomEvent ce = new CustomEvent(this);
publisher.publishEvent(ce);
}
}
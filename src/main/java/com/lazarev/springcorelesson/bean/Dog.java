package com.lazarev.springcorelesson.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Pet {
    public void say(){
        System.out.println("wow-wow");
    }
}

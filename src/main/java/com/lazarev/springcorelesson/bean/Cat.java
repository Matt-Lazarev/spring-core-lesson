package com.lazarev.springcorelesson.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Primary
@Component
public class Cat extends Pet {
    public void say(){
        System.out.println("meow");
    }

    @PostConstruct
    void init(){

    }
}

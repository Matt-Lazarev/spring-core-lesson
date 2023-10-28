package com.lazarev.springcorelesson.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope("prototype")
// Person -> person, MyPerson -> myPerson, SQLClass -> SQLClass
@Component
public class Person {
    public Person(){
        System.out.println("constructor");
    }

    public void walk(){
        System.out.println("Walking");
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}

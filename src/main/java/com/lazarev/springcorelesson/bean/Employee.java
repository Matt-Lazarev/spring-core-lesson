package com.lazarev.springcorelesson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private final Pet pet; //@Bean, @Component

    @Autowired
    public Employee(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public void pet(){
        pet.say();
    }
}

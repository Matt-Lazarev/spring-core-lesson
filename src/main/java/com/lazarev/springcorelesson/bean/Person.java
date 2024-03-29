package com.lazarev.springcorelesson.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Pet pet; //@Bean, @Component

    @Value("Kate")
    private String name;

    @Value("1")
    private Integer age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    public void pet(){
        pet.say();
    }

    public String getName() {
        return name;
    }
}

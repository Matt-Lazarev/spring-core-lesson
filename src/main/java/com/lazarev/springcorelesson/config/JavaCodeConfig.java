package com.lazarev.springcorelesson.config;

import com.lazarev.springcorelesson.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Random;

public class JavaCodeConfig {

    @Bean
    @Scope("prototype")
    public Cat cat(){
        //10 strs
        return new Cat();
    }

    @Bean
    public String myString(){
        return "my-string-bean";
    }

}

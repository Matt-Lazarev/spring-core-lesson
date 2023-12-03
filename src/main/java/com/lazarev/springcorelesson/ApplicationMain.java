package com.lazarev.springcorelesson;

import com.lazarev.springcorelesson.bean.Person;
import com.lazarev.springcorelesson.config.AnnotationConfig;
import com.lazarev.springcorelesson.config.JavaCodeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;
import java.sql.Connection;

public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Person p = context.getBean(Person.class);
        p.pet();

        Connection bean = context.getBean(Connection.class);
        System.out.println(bean);
    }
}

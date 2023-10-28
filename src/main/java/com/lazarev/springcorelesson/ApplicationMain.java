package com.lazarev.springcorelesson;

import com.lazarev.springcorelesson.bean.Cat;
import com.lazarev.springcorelesson.bean.Person;
import com.lazarev.springcorelesson.config.AnnotationConfig;
import com.lazarev.springcorelesson.config.JavaCodeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("application-context.xml");

        // 1. Читает конф. файл (xml).
        // 2. Список пар (id, class), List<Pair>, Pair (id, class)
        // 3. Рефлексия

//        String beanClassName = "com.lazarev.springcorelesson.bean.Person";
//        Class<?> beanClass = Class.forName(beanClassName);
//        Person bean = (Person) beanClass.getDeclaredConstructor().newInstance();

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Person person1 = context.getBean(Person.class); //bean1
        System.out.println(person1);

        context.close();

//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(JavaCodeConfig.class);
//
//        Cat bean1 = context.getBean(Cat.class);
//        Cat bean2 = context.getBean(Cat.class);
//        System.out.println(bean1);
//        System.out.println(bean2);
//
//        String strBean = context.getBean(String.class);
//        System.out.println(strBean);
    }

//    private static <T> T getBean(Class<T> beanClass) throws Exception{
//        return beanClass.getDeclaredConstructor().newInstance();
//    }

}

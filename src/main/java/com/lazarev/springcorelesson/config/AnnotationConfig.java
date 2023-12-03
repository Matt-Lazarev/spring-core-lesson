package com.lazarev.springcorelesson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
@ComponentScan("com.lazarev.springcorelesson")
public class AnnotationConfig {
}

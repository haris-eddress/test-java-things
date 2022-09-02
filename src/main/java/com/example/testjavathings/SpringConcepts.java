package com.example.testjavathings;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConcepts {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
    }
}

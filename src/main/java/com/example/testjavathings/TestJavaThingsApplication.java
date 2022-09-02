package com.example.testjavathings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestController
@RequestMapping
@SpringBootApplication
public class TestJavaThingsApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestJavaThingsApplication.class, args);
    }


    @Autowired @Lazy private TestLazyInit testLazyInit;
    @GetMapping
    public void getRequest() {
        System.out.println("getRequest!");
    }
    

}

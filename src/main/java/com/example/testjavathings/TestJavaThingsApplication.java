package com.example.testjavathings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//@SpringBootApplication
public class TestJavaThingsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TestJavaThingsApplication.class, args);

        // Check data time format.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm a z").withLocale(Locale.ENGLISH);
    }

}

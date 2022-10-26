package com.example.testjavathings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
public class TestJavaThingsApplication {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm a");

    public static void main(String[] args) {

        checkTime("12:00 am");
//        SpringApplication.run(TestJavaThingsApplication.class, args);
    }

    public static void checkTime(String time) {
        LocalDateTime startTime = LocalTime.parse(time, dateTimeFormatter).atDate(LocalDate.now());
        System.out.println(startTime);
    }
}

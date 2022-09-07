package com.example.testjavathings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    private final ApplicationEventPublisher publisher;

    @Autowired
    public Controller(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping
    void testRequest() {
        publisher.publishEvent(new UserCreatedEvent("Haris Ashfaq"));
    }
}

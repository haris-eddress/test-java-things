package com.example.testjavathings;

import org.springframework.stereotype.Component;

@Component
public class TestLazyInit {

    TestLazyInit() {
        System.out.println("This bean will be lazy initialized!!!");
    }
}


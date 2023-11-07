package com.example.thirdProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class DummyLogger {
    private String name = "Name" + System.currentTimeMillis();
    public void sayHello() {
        log.info("hello from DummyLogger" + name);
        System.out.println(System.currentTimeMillis() + "Test message" + name);
    }
}



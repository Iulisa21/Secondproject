package com.example.secondProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from task1");

    }
}
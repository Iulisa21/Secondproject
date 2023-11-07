package com.example.thirdProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task3Config {
    @Bean
    public DummyLogger createBean(){
        DummyLogger dummyLogger = new DummyLogger();
        return new DummyLogger();
    }

}

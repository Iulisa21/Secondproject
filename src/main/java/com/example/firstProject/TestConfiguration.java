package com.example.firstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    protected FirstBean firstBeanReturn() {
        return new FirstBean();
    }
}

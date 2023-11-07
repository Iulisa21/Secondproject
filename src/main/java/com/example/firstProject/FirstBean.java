package com.example.firstProject;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public class FirstBean {

    private String name= "Test" + System.currentTimeMillis();

}


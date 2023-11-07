package com.example.firstProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements CommandLineRunner {
    private final ApplicationContext context;

    public TestBean(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        FirstBean bean = context.getBean(FirstBean.class);
        FirstBean bean1 = context.getBean(FirstBean.class);
        FirstBean bean2 = context.getBean(FirstBean.class);
        System.out.println(bean.getName());
        System.out.println(bean1.getName());
        System.out.println(bean2.getName());
    }
}


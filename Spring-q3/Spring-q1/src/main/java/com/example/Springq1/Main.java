package com.example.Springq1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee employee = (Employee) config.getBean("Emp");
        System.out.println("Employee Details" + employee);

    }
}

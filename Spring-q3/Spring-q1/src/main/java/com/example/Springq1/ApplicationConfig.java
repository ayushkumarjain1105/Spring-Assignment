package com.example.Springq1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ApplicationConfig {


    @Bean(name = "Emp")
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Ayush");
        employee.setPassObj(getPassport());
        return employee;
    }
    @Bean(name = "passport")
    public Passport getPassport(){
        Date d = new Date(2050,02,02);
        Passport passport = new Passport();
        passport.setPassNum(1212);
        passport.setDateOfIssue(new Date());
        passport.setDateOfExpiry(d);
        return passport;
    }
}

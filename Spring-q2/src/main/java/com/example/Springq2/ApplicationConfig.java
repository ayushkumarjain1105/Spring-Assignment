package com.example.Springq2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean(name = "vehicle")
    public Vehicle getVehicle(){
        return new Vehicle();
    }
}

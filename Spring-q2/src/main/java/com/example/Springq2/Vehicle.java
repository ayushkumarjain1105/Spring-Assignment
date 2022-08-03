package com.example.Springq2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Vehicle {
    @Value("Chennai")
    private String source;
    @Value("#{{'Bangalore': 1500, 'Delhi' : 2500, 'Mumbai': 2000, 'Hyderabad' :1000, 'Pune' : 2500 }}")
    Map<String, Double> destinationMap;
}

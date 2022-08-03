package com.example.Springq1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Employee {
    int empId;
    String empName;
    Passport passObj;
}

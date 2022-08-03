package com.example.Springq1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Passport {
    private int passNum;
    private Date dateOfIssue;
    private Date dateOfExpiry;
}

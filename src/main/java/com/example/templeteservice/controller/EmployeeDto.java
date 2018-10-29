package com.example.templeteservice.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class EmployeeDto {

    private String employeeId;
    private String employeeName;
    private String email;
}

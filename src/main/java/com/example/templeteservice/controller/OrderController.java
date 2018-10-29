package com.example.templeteservice.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Builder
@Data
@AllArgsConstructor
public class OrderController {

    @GetMapping(path = "/v1/employees", produces = APPLICATION_JSON_VALUE)
    public List<EmployeeDto>  getEmployees() {
       return employeesBuilder();

    }


    @GetMapping(path = "/v1/get", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getTemplateService() {
        return ResponseEntity.ok("HelloTemplateService");

    }

    private static List<EmployeeDto> employeesBuilder() {

        EmployeeDto employeeDto = EmployeeDto.builder()
                .email("chiruS1@gmail.com")
                .employeeId("2")
                .employeeName("chiru")
                .build();

        EmployeeDto employeeDto1 = EmployeeDto.builder()
                .email("sanjeev@gmail.com")
                .employeeId("1")
                .employeeName("sanjeev")
                .build();

        return Arrays.asList(employeeDto, employeeDto1);

    }
}

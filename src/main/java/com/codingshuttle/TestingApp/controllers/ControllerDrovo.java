package com.codingshuttle.TestingApp.controllers;

import com.codingshuttle.TestingApp.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("drovo")
public class ControllerDrovo {
    @GetMapping
    public ResponseEntity<EmployeeDto> getDrovoInfo() {

        EmployeeDto drovo = new EmployeeDto();
        drovo.setName("Mah Dian Drovo");
        drovo.setEmail("mahdian@example.com");
        drovo.setSalary(50000L);

        return ResponseEntity.ok(drovo);
    }
}

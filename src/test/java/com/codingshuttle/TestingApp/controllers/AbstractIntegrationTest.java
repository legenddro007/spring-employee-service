package com.codingshuttle.TestingApp.controllers;

import com.codingshuttle.TestingApp.dto.EmployeeDto;
import com.codingshuttle.TestingApp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient(timeout = "10000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbstractIntegrationTest {

    @Autowired
    public WebTestClient webTestClient;

    public Employee testEmployee = Employee.builder()
            .id(1L)
                .name("Mah Dian Drovo")
                .email("mahdian.drovo@gmail.com")
                .salary(100L)
                .build();

    public EmployeeDto testEmployeeDto = EmployeeDto.builder()
            .id(1L)
                .name("Mah Dian Drovo")
                .email("mahdian.drovo@gmail.com")
                .salary(100L)
                .build();

}

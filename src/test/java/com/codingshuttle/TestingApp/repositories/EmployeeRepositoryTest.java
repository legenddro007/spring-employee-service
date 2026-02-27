package com.codingshuttle.TestingApp.repositories;

import com.codingshuttle.TestingApp.entities.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employee;
    @BeforeEach
    void setUp() {
        employee = Employee.builder()
                .id(1L)
                .name("Drovo")
                .email("drovo@gmail.com")
                .salary(100L)
                .build();
    }

    @Test
    void testFindByEmail_whenEmailIsPresrent_thenReturnEmployee() {
        //Arrange or, Given
        employeeRepository.save(employee);

        //Act or, When
        List<Employee> employeeList = employeeRepository.findByEmail(employee.getEmail());

        //Assert or, Then
        assertThat(employeeList).isNotEmpty();
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.get(0).getName()).isEqualTo("Drovo");
    }

    @Test
    void testFindByEMail_whenEmailIsNotFound_thenReturnEmptyEmployeeList() {
        //Arrange
        String email = "hello@gmail.com";
        //Act
        List<Employee> employeeList = employeeRepository.findByEmail(employee.getEmail());
        //Assert
        assertThat(employeeList).isNotNull();
        assertThat(employeeList).isEmpty();
    }
}
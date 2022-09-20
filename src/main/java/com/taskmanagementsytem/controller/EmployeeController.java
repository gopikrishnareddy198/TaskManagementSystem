package com.taskmanagementsytem.controller;

//import com.taskmanagementsytem.Employee;
//import com.taskmanagementsytem.repo.EmployeeRepository;
import com.taskmanagementsytem.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {

 /*   @Autowired
    private EmployeeRepository employeeRepository;*/

    @GetMapping("/employees")
    public List<Employee> fetchEmployees(){
        Arrays.asList(new Employee(1l,"Alex","Lester","lester@gmail.com"),
                new Employee(2l,"Betty","Pry","Pry@gmail.com"),
                new Employee(3l,"Bree","Numan","Numan@gmail.com"));

        return null;

    }
}
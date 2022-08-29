package com.taskmanagementsytem.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping
    public String getTasks(){
        return "Tasks \n" +
                "{Task 1: Done}" +
                "{Task 2: Pending}"+
                "{Task 3: Not Opened}"+
                "{Task 4: Not Opened}";
    }

}

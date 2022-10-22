package com.taskmanagementsytem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class AdminComment {

    private String adminName;
    private LocalTime commentedAt;
    private String comment;
}

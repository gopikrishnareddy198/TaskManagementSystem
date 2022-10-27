package com.taskmanagementsytem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;


@Data
@AllArgsConstructor
public class UserComment {

    private String username;
    private LocalTime commentedAt;
    private String comment;
}

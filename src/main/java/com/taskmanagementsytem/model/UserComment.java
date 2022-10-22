package com.taskmanagementsytem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;


@Data
@AllArgsConstructor
public class UserComment {

    private String username;
    private LocalTime commentedAt;
    private String comment;
}

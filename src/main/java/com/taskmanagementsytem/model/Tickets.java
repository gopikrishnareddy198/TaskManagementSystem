package com.taskmanagementsytem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "tickets")
@Data
@AllArgsConstructor
public class Tickets {

    @Id
    private Integer ticketNum;
    private String title;
    private String description;
    private LocalDate creationDate;
    private LocalTime creationTime;
    private String idOfTheUserWhoCreatedTicket;
    private String assignedTo;
    private String status;
    private String priority;
    private String category;


}

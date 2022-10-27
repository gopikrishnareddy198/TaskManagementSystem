package com.taskmanagementsytem.bo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class TicketBO {


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

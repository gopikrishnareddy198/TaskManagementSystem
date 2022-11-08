package com.taskmanagementsytem.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "tickets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    private Long ticketNum;
    private String title;
    private String description;
    private LocalDate creationDate;
    private LocalTime creationTime;
    private String idOfTheUserWhoCreatedTicket;
    private String assignedTo;
    private String status;
    private String priority;
    private String category;

    @Transient
    public static final String SEQUENCE_NAME="ticket_sequence";


}

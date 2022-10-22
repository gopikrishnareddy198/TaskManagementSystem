package com.taskmanagementsytem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection="chats")
@Data
@AllArgsConstructor
public class Chats {

    @Id
    private Integer ticketNum;
    private UserComment[] userComment;
    private AdminComment[] adminComment;

 }

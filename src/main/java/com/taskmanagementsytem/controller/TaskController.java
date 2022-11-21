package com.taskmanagementsytem.controller;

import com.taskmanagementsytem.bo.TicketBO;
import com.taskmanagementsytem.entity.Ticket;
import com.taskmanagementsytem.repo.TicketsRepo;
import com.taskmanagementsytem.security.service.JwtUserDetailsService;
import com.taskmanagementsytem.service.SequenceGeneratorService;
import com.taskmanagementsytem.util.Status;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/tickets")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    private TicketsRepo ticketsRepo;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @PostMapping(value = "/create-ticket", consumes="application/json")
    public Ticket addNewTicket(@RequestBody TicketBO ticketBO){
        Ticket ticket=new Ticket();
        BeanUtils.copyProperties(ticketBO,ticket);
        ticket.setIdOfTheUserWhoCreatedTicket(jwtUserDetailsService.getUserIdOfCurrentlyLoggedInUser().toString());
        ticket.setTicketNum(sequenceGeneratorService.generateSequence(ticket.SEQUENCE_NAME));
        ticket.setCreationDate(LocalDate.now());
        ticket.setCreationTime(LocalTime.now());
        ticket.setStatus(Status.NEW);
        ticketsRepo.save(ticket);
        return ticket;
    }

    @GetMapping(value="/fetch-all-tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        ResponseEntity<List<Ticket>> responseEntity;
        HttpHeaders httpHeaders;

        httpHeaders=new HttpHeaders();

        responseEntity=new ResponseEntity<>(ticketsRepo.findAll(),httpHeaders, HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping(value = "/fetch-one-ticket")
    public ResponseEntity<String> getATicket(){
        ResponseEntity<String> responseEntity;
        String body;
        HttpHeaders headers;

        headers=new HttpHeaders();

        body="{Ticket 0: Not Opened}";
        responseEntity=new ResponseEntity<>(body,headers,HttpStatus.OK);

        return responseEntity;
    }

    @GetMapping(value = "/fetch-not-opened")
    public String notOpenedTickets(){
        return "Tickets {Ticket 0: Not Opened}";
    }

    @GetMapping(value = "/fetch-opened")
    public String openedTiceket(){
        return "Tickets {Ticket 0: Opened}";
    }



}

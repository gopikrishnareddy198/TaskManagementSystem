package com.taskmanagementsytem.controller;

import com.taskmanagementsytem.bo.TicketBO;
import com.taskmanagementsytem.entity.Ticket;
import com.taskmanagementsytem.repo.TicketsRepo;
import com.taskmanagementsytem.security.service.JwtUserDetailsService;
import com.taskmanagementsytem.service.SequenceGeneratorService;
import com.taskmanagementsytem.util.Status;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping("/tickets")
public class TaskController {

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    private TicketsRepo ticketsRepo;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @PostMapping(value = "/create-ticket")
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
    public String getAllTickets(){
        return "Tickets \n" +
                "{Ticket 1: Done}" +
                "{Ticket 2: Pending}"+
                "{Ticket 3: Not Opened}"+
                "{Ticket 4: Not Opened}";
    }

    @GetMapping(value = "/fetch-one-ticket")
    public String getATicket(){
        return "{Ticket 0: Not Opened}";
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

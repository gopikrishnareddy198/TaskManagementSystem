package com.taskmanagementsytem.controller;

import com.taskmanagementsytem.repo.TicketsRepo;
import com.taskmanagementsytem.security.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TaskController {

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    private TicketsRepo ticketsRepo;

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

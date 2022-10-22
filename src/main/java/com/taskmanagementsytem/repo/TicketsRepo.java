package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.model.Tickets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepo extends MongoRepository<Tickets, Integer> {
    Tickets findByTicketNum(Integer i);
}

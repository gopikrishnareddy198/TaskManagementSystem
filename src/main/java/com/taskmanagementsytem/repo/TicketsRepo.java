package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.entity.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepo extends MongoRepository<Ticket, Integer> {
    Ticket findByTicketNum(Integer i);
}

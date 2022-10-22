package com.taskmanagementsytem.runner;

import com.taskmanagementsytem.model.*;
import com.taskmanagementsytem.repo.ChatsRepo;
import com.taskmanagementsytem.repo.TicketsRepo;
import com.taskmanagementsytem.repo.UserRepo;
import com.taskmanagementsytem.util.Priority;
import com.taskmanagementsytem.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
@Component
public class SaveDataRunner implements CommandLineRunner {


    @Autowired
    private TicketsRepo ticketsRepo;
    @Autowired
    private ChatsRepo chatsRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {

      /*  UserComment[] userComment;
        AdminComment[] adminComment;

        Tickets tickets1=new Tickets(1,"Cannot open the channel","When I tried to open the channel it is giving the 405 issue", LocalDate.now(), LocalTime.now(),"Khomsun","Gopi", Status.NEW, Priority.HIGH);
        Tickets tickets2=new Tickets(2,"Cannot push the changes","I cannot make the changes in my system", LocalDate.now(), LocalTime.now(),"Suhas","Shamitha", Status.NEW, Priority.MEDIUM);


        ticketsRepo.save(tickets1);

        ticketsRepo.save(tickets2);

        userComment=new UserComment[1];
        userComment[0]=new UserComment(tickets1.getCreatedBy(),LocalTime.now(),"I'll start working on it");

        adminComment=new AdminComment[1];
        adminComment[0]=new AdminComment("Khomsum",LocalTime.now(),"Please start it as soon as possible");

        chatsRepo.save(new Chats(tickets1.getTicketNum(),userComment, adminComment));

*/




    }
}

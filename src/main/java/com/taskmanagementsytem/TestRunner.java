package com.taskmanagementsytem;

import com.taskmanagementsytem.entity.Role;
import com.taskmanagementsytem.entity.User;
import com.taskmanagementsytem.entity.UserRole;
import com.taskmanagementsytem.repo.TicketsRepo;
import com.taskmanagementsytem.repo.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;
    @Autowired
    TicketsRepo ticketsRepo;


    @Override
    public void run(String... args) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();


/*
        userRepo.save(new User(new ObjectId(),"sxa30590",  bCryptPasswordEncoder.encode("abc124"),"Sindu",
                Set.of(new UserRole(new Role("ROLE_ADMIN")))));

        userRepo.save(new User(new ObjectId(),"gxa30590", bCryptPasswordEncoder.encode("abc123"),"Gopi",
                Set.of(new UserRole(new Role("ROLE_ADMIN")),new UserRole(new Role("ROLE_USER")))));

        userRepo.save(new User(new ObjectId(),"sxd19850", bCryptPasswordEncoder.encode("abc125"),"Suhas",
                Set.of(new UserRole(new Role("ROLE_USER")))));

        userRepo.save(new User(new ObjectId(),"kho1111", bCryptPasswordEncoder.encode("abc126"),"Khomsun",
                Set.of(new UserRole(new Role("ROLE_ADMIN")))));

*/

        //  userRepo.findAll().forEach(System.out::println);

       /* Tickets tickets1=
        ticketsRepo.findByTicketNum(1);

                tickets1.setCategory("SOFTWARE");
        ticketsRepo.save(tickets1);
        Tickets tickets2=
                ticketsRepo.findByTicketNum(2);
        tickets1.setCategory("APPLICATION");

        ticketsRepo.save(tickets2);



        ticketsRepo.save(new Tickets(3,"Cannot login to the system with old credentials",
                "I tried logging into the system with the old credentials username: jhon@icici.com password: ici123", LocalDate.now(),
                LocalTime.now(),"Adam","Bob",
                Priority.LOW, Status.NEW,"APPLICATION"));

        ticketsRepo.save(new Tickets(4,"The chip of the card is not working",
                "I cannot use the chip card at any of the counters", LocalDate.now(), LocalTime.now(),"Adam","Bob",
                Priority.LOW, Status.NEW,"HARDWARE"));

 */

    }
}

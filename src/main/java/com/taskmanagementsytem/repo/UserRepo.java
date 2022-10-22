package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
    User findByUsername(String username);
}

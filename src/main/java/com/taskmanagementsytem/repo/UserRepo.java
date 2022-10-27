package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    User findByUsername(String username);
}

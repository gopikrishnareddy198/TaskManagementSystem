package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.entity.Chats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatsRepo extends MongoRepository<Chats, Integer> {

}

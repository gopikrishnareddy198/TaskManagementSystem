package com.taskmanagementsytem.repo;

import com.taskmanagementsytem.model.Chats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatsRepo extends MongoRepository<Chats, Integer> {

}

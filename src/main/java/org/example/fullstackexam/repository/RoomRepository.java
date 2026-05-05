package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
}
package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Rent;

public interface RentRepository extends MongoRepository<Rent, String> {
}
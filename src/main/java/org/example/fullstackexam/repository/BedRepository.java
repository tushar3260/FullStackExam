package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Bed;

public interface BedRepository extends MongoRepository<Bed, String> {
}
package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Visitor;

public interface VisitorRepository extends MongoRepository<Visitor, String> {
}
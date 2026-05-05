package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Complaint;

public interface ComplaintRepository extends MongoRepository<Complaint, String> {
}
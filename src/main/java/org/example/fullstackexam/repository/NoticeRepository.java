package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Notice;

public interface NoticeRepository extends MongoRepository<Notice, String> {
}
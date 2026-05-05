package org.example.fullstackexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.fullstackexam.model.Tenant;

public interface TenantRepository extends MongoRepository<Tenant, String> {

}
package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Tenant;
import org.example.fullstackexam.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {

    @Autowired
    private TenantRepository repo;

    public Tenant addTenant(Tenant t) {
        return repo.save(t);
    }

    public List<Tenant> getAllTenants() {
        return repo.findAll();
    }
}
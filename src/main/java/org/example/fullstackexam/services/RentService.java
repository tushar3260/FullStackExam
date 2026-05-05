package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Rent;
import org.example.fullstackexam.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService {

    @Autowired
    private RentRepository repo;

    public Rent addRent(Rent rent) {
        return repo.save(rent);
    }

    public List<Rent> getAllRent() {
        return repo.findAll();
    }
}
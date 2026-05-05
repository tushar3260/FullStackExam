package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Bed;
import org.example.fullstackexam.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedService {

    @Autowired
    private BedRepository repo;

    public Bed addBed(Bed bed) {
        return repo.save(bed);
    }

    public List<Bed> getAllBeds() {
        return repo.findAll();
    }
}
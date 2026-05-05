package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Complaint;
import org.example.fullstackexam.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repo;

    public Complaint addComplaint(Complaint c) {
        c.setStatus("OPEN");
        return repo.save(c);
    }

    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }
}
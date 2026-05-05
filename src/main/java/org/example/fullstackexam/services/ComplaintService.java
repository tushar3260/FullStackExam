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
        if (c.getStatus() == null) {
            c.setStatus("OPEN");
        }
        return repo.save(c);
    }

    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }

    public Complaint resolveComplaint(String id) {
        Complaint c = repo.findById(id).orElseThrow();
        c.setStatus("RESOLVED");
        return repo.save(c);
    }

    public void deleteComplaint(String id) {
        repo.deleteById(id);
    }
}
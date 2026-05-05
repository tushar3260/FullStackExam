package org.example.fullstackexam.services;

import org.example.fullstackexam.model.Visitor;
import org.example.fullstackexam.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository repo;

    public Visitor addVisitor(Visitor v) {
        v.setStatus("PENDING");
        return repo.save(v);
    }

    public List<Visitor> getAllVisitors() {
        return repo.findAll();
    }

    public Visitor approveVisitor(String id) {
        Optional<Visitor> opt = repo.findById(id);
        if (opt.isPresent()) {
            Visitor v = opt.get();
            v.setStatus("APPROVED");
            return repo.save(v);
        }
        return null;
    }

    public Visitor rejectVisitor(String id) {
        Optional<Visitor> opt = repo.findById(id);
        if (opt.isPresent()) {
            Visitor v = opt.get();
            v.setStatus("DENIED");
            return repo.save(v);
        }
        return null;
    }
}
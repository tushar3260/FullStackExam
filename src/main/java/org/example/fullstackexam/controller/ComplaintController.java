package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Complaint;
import org.example.fullstackexam.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping("/add")
    public Complaint add(@RequestBody Complaint c) {
        return service.addComplaint(c);
    }

    @GetMapping("/all")
    public List<Complaint> getAll() {
        return service.getAllComplaints();
    }

    @PutMapping("/resolve/{id}")
    public Complaint resolve(@PathVariable String id) {
        return service.resolveComplaint(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        service.deleteComplaint(id);
    }
}
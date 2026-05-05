package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Visitor;
import org.example.fullstackexam.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitor")
public class VisitorController {

    @Autowired
    private VisitorService service;

    @PostMapping("/add")
    public Visitor add(@RequestBody Visitor v) {
        return service.addVisitor(v);
    }

    @GetMapping("/all")
    public List<Visitor> getAll() {
        return service.getAllVisitors();
    }

    @PutMapping("/approve/{id}")
    public Visitor approve(@PathVariable String id) {
        return service.approveVisitor(id);
    }

    @PutMapping("/reject/{id}")
    public Visitor reject(@PathVariable String id) {
        return service.rejectVisitor(id);
    }
}
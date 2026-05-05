package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Bed;
import org.example.fullstackexam.services.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {

    @Autowired
    private BedService service;

    @PostMapping("/add")
    public Bed add(@RequestBody Bed b) {
        return service.addBed(b);
    }

    @GetMapping("/all")
    public List<Bed> getAll() {
        return service.getAllBeds();
    }
}
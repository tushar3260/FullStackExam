package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Rent;
import org.example.fullstackexam.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentController {

    @Autowired
    private RentService service;

    @PostMapping("/add")
    public Rent add(@RequestBody Rent r) {
        return service.addRent(r);
    }

    @GetMapping("/all")
    public List<Rent> getAll() {
        return service.getAllRent();
    }
}
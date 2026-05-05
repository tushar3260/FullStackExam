package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Tenant;
import org.example.fullstackexam.services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    private TenantService service;

    @PostMapping("/add")
    public Tenant add(@RequestBody Tenant t) {
        return service.addTenant(t);
    }

    @GetMapping("/all")
    public List<Tenant> getAll() {
        return service.getAllTenants();
    }
}
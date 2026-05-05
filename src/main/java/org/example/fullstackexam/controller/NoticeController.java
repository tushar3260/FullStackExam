package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Notice;
import org.example.fullstackexam.services.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @PostMapping("/add")
    public Notice add(@RequestBody Notice n) {
        return service.addNotice(n);
    }

    @GetMapping("/all")
    public List<Notice> getAll() {
        return service.getAllNotices();
    }
}
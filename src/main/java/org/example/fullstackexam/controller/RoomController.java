package org.example.fullstackexam.controller;

import org.example.fullstackexam.model.Room;
import org.example.fullstackexam.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService service;

    @PostMapping("/add")
    public Room add(@RequestBody Room r) {
        return service.addRoom(r);
    }

    @GetMapping("/all")
    public List<Room> getAll() {
        return service.getAllRooms();
    }
}
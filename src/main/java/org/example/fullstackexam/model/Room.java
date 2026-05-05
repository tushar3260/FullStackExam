package org.example.fullstackexam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
public class Room {

    @Id
    private String id;
    private int floorNumber;
    private int roomNumber;
    private int totalBeds;
    private int occupiedBeds;

    public Room() {}
    public Room(String id, int floorNumber, int roomNumber, int totalBeds, int occupiedBeds) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.totalBeds = totalBeds;
        this.occupiedBeds = occupiedBeds;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public int getFloorNumber() { return floorNumber; }
    public void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }
    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public int getTotalBeds() { return totalBeds; }
    public void setTotalBeds(int totalBeds) { this.totalBeds = totalBeds; }
    public int getOccupiedBeds() { return occupiedBeds; }
    public void setOccupiedBeds(int occupiedBeds) { this.occupiedBeds = occupiedBeds; }
}
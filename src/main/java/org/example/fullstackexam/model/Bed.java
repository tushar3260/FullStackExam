package org.example.fullstackexam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beds")
public class Bed {

    @Id
    private String id;
    private String roomId;
    private String bedNumber;
    private boolean occupied;

    public Bed() {}
    public Bed(String id, String roomId, String bedNumber, boolean occupied) {
        this.id = id;
        this.roomId = roomId;
        this.bedNumber = bedNumber;
        this.occupied = occupied;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getRoomId() { return roomId; }
    public void setRoomId(String roomId) { this.roomId = roomId; }
    public String getBedNumber() { return bedNumber; }
    public void setBedNumber(String bedNumber) { this.bedNumber = bedNumber; }
    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}
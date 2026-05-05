package org.example.fullstackexam.model;

public class Tenant {

    private String id;
    private String name;
    private String phone;
    private String email;
    private String roomId;
    private String bedId;
    private boolean active;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRoomId() { return roomId; }
    public void setRoomId(String roomId) { this.roomId = roomId; }

    public String getBedId() { return bedId; }
    public void setBedId(String bedId) { this.bedId = bedId; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
package org.example.fullstackexam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "visitors")
public class Visitor {

    @Id
    private String id;
    private String name;
    private String phone;
    private String purpose;
    private String tenantId;
    private String status; 
    private String photoUrl;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public Visitor() {}
    public Visitor(String id, String name, String phone, String purpose, String tenantId, String status, String photoUrl, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.purpose = purpose;
        this.tenantId = tenantId;
        this.status = status;
        this.photoUrl = photoUrl;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }
    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }
    public LocalDateTime getCheckIn() { return checkIn; }
    public void setCheckIn(LocalDateTime checkIn) { this.checkIn = checkIn; }
    public LocalDateTime getCheckOut() { return checkOut; }
    public void setCheckOut(LocalDateTime checkOut) { this.checkOut = checkOut; }
}
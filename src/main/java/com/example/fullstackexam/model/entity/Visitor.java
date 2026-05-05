package com.example.fullstackexam.model.entity;

import com.example.fullstackexam.model.enums.VisitorStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String purpose;
    private String photoUrl;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant visitingTenant;

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    @Enumerated(EnumType.STRING)
    private VisitorStatus status;
}

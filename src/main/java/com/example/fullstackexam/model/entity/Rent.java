package com.example.fullstackexam.model.entity;

import com.example.fullstackexam.model.enums.RentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    private String month;
    private Integer year;
    private Double rentAmount;
    private Double electricityBill;
    private Double messBill;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private RentStatus status;
}

package org.example.fullstackexam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "rents")
public class Rent {

    @Id
    private String id;
    private String tenantId;
    private double rentAmount;
    private double electricityBill;
    private double messBill;
    private double totalAmount;
    private String status; 
    private String paymentProofUrl;
    private LocalDate dueDate;
    private LocalDate paidDate;

    public Rent() {}
    public Rent(String id, String tenantId, double rentAmount, double electricityBill, double messBill, double totalAmount, String status, String paymentProofUrl, LocalDate dueDate, LocalDate paidDate) {
        this.id = id;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
        this.electricityBill = electricityBill;
        this.messBill = messBill;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paymentProofUrl = paymentProofUrl;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public double getRentAmount() { return rentAmount; }
    public void setRentAmount(double rentAmount) { this.rentAmount = rentAmount; }
    public double getElectricityBill() { return electricityBill; }
    public void setElectricityBill(double electricityBill) { this.electricityBill = electricityBill; }
    public double getMessBill() { return messBill; }
    public void setMessBill(double messBill) { this.messBill = messBill; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPaymentProofUrl() { return paymentProofUrl; }
    public void setPaymentProofUrl(String paymentProofUrl) { this.paymentProofUrl = paymentProofUrl; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public LocalDate getPaidDate() { return paidDate; }
    public void setPaidDate(LocalDate paidDate) { this.paidDate = paidDate; }
}
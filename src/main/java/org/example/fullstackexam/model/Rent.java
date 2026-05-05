package org.example.fullstackexam.model;

import java.time.LocalDate;

public class Rent {

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
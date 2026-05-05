package org.example.fullstackexam.dto;

public class RentDTO {

    private String tenantId;
    private double rentAmount;
    private double electricityBill;
    private double messBill;
    private String paymentProofUrl;

    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }

    public double getRentAmount() { return rentAmount; }
    public void setRentAmount(double rentAmount) { this.rentAmount = rentAmount; }

    public double getElectricityBill() { return electricityBill; }
    public void setElectricityBill(double electricityBill) { this.electricityBill = electricityBill; }

    public double getMessBill() { return messBill; }
    public void setMessBill(double messBill) { this.messBill = messBill; }

    public String getPaymentProofUrl() { return paymentProofUrl; }
    public void setPaymentProofUrl(String paymentProofUrl) { this.paymentProofUrl = paymentProofUrl; }
}

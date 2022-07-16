package com.example.loanapp.models;

import java.time.LocalDate;

public class PaymentMethod {
    private int payment_method_id;
    private String name;
    private LocalDate createdDate = LocalDate.now();

    public PaymentMethod() {
    }

    public PaymentMethod(int payment_method_id, String name, LocalDate createdDate) {
        this.payment_method_id = payment_method_id;
        this.name = name;
        this.createdDate = createdDate;
    }

    public PaymentMethod(String name, LocalDate createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public int getPayment_method_id() {
        return payment_method_id;
    }

    public void setPayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "payment_method_id=" + payment_method_id +
                ", name='" + name + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}

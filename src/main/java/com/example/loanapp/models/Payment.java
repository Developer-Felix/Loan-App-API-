package com.example.loanapp.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payments_table")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "load_id_loan_id")
    private Loan load_id;
    @ManyToOne
    @JoinColumn(name = "user_id_id")
    private AppUser user_id;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "payment_method_id_payment_method_id")
    private PaymentMethod payment_method_id;

    public Payment() {
    }

    public Payment(Loan load_id, AppUser user_id, int amount, PaymentMethod payment_method_id) {
        this.load_id = load_id;
        this.user_id = user_id;
        this.amount = amount;
        this.payment_method_id = payment_method_id;
    }

    public Payment(int id, Loan load_id, AppUser user_id, int amount, PaymentMethod payment_method_id) {
        this.id = id;
        this.load_id = load_id;
        this.user_id = user_id;
        this.amount = amount;
        this.payment_method_id = payment_method_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Loan getLoad_id() {
        return load_id;
    }

    public void setLoad_id(Loan load_id) {
        this.load_id = load_id;
    }

    public AppUser getUser_id() {
        return user_id;
    }

    public void setUser_id(AppUser user_id) {
        this.user_id = user_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMethod getPayment_method_id() {
        return payment_method_id;
    }

    public void setPayment_method_id(PaymentMethod payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", load_id=" + load_id +
                ", user_id=" + user_id +
                ", amount=" + amount +
                ", payment_method_id=" + payment_method_id +
                '}';
    }
}

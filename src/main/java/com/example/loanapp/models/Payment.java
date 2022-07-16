package com.example.loanapp.models;

public class Payment {
    private int payment_id;
    private Loan load_id;
    private AppUser user_id;
    private int amount;
    private PaymentMethod payment_method_id;


    public Payment() {
    }

    public Payment(Loan load_id, AppUser user_id, int amount, PaymentMethod payment_method_id) {
        this.load_id = load_id;
        this.user_id = user_id;
        this.amount = amount;
        this.payment_method_id = payment_method_id;
    }

    public Payment(int payment_id, Loan load_id, AppUser user_id, int amount, PaymentMethod payment_method_id) {
        this.payment_id = payment_id;
        this.load_id = load_id;
        this.user_id = user_id;
        this.amount = amount;
        this.payment_method_id = payment_method_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
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
                "payment_id=" + payment_id +
                ", load_id=" + load_id +
                ", user_id=" + user_id +
                ", amount=" + amount +
                ", payment_method_id=" + payment_method_id +
                '}';
    }
}

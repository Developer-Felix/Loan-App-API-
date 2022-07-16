package com.example.loanapp.models;

import java.time.LocalDate;

public class Loan {
    private int loan_id;
    private  String amount;
    private  AppUser user;
    private LocalDate createdDate = LocalDate.now();
    private LocalDate updatedDate = LocalDate.now();

    public Loan() {
    }


    public Loan(String amount, AppUser user, LocalDate createdDate, LocalDate updatedDate) {
        this.amount = amount;
        this.user = user;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Loan(int loan_id, String amount, AppUser user, LocalDate createdDate, LocalDate updatedDate) {
        this.loan_id = loan_id;
        this.amount = amount;
        this.user = user;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }



    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loan_id=" + loan_id +
                ", amount='" + amount + '\'' +
                ", user=" + user +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}

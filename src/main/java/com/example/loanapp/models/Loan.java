package com.example.loanapp.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "loan_table")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id", nullable = false)
    private int id;


    @OneToOne
    private  AppUser user;

    private int amount;
    private LocalDate createdDate = LocalDate.now();
    private LocalDate updatedDate = LocalDate.now();


    public Loan() {
    }

    public Loan(int id, AppUser user, int amount) {
        this.id = id;
        this.user = user;
        this.amount = amount;
    }

    public Loan(AppUser user, int amount, LocalDate createdDate, LocalDate updatedDate) {
        this.user = user;
        this.amount = amount;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Loan(int id, AppUser user, int amount, LocalDate createdDate, LocalDate updatedDate) {
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
                "id=" + id +
                ", user=" + user +
                ", amount=" + amount +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}

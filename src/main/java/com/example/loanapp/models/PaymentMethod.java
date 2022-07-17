package com.example.loanapp.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;



@Data
@Entity
@Table(name = "payment_method_table")
public class PaymentMethod {
    @Id
    @SequenceGenerator(
            name = "payment_method_sequence",
            sequenceName = "payment_method_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator= "payment_method_sequence"
    )
    @Column(name = "payment_method_id", nullable = false)
    private int id;
    @Column(name = "Name",nullable = false)
    private String name;

    public PaymentMethod(int id, String name) {
    }

    public PaymentMethod() {
    }



    public PaymentMethod(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

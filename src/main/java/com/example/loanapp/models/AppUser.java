package com.example.loanapp.models;

import java.time.LocalDate;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "user_table")
public class AppUser {
    @Id
    @SequenceGenerator(
            name = "app_user_sequence",
            sequenceName = "app_user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator= "app_user_sequence"
    )
    private int id;
    
    @Column(name="Username")
    private String userName;
    @Column(name="Email")
    private String email;
    @Column(name="password")
    private String password;


//    @Column(name="confirm_password")
//    private String confirmPassword;
//    @Column(name="Date Created")
//    private LocalDate createdDate = LocalDate.now();
//    @Column(name="IsCustomer")
//    private Boolean isCustomer = false;
//    @Column(name="IsAdmin")
//    private Boolean isAdmin = false;
//    @Column(name="IsSuperAdmin")
//    private Boolean isSuperAdmin = false;
//    @Column(name="IsOnline")
//    private Boolean isOnline = false;



}

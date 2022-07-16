package com.example.loanapp.models;

import java.time.LocalDate;

public class AppUser {
    private int user_id;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private LocalDate createdDate = LocalDate.now();
    private Boolean isCustomer = false;
    private Boolean isAdmin = false;
    private Boolean isSuperAdmin = false;
    private Boolean isOnline = false;

    //Empty Constructor
    public AppUser() {
    }

    //Constructor with all properties
    public AppUser(int user_id, String userName, String email, String password, String confirmPassword, LocalDate createdDate, Boolean isCustomer, Boolean isAdmin, Boolean isSuperAdmin, Boolean isOnline) {
        this.user_id = user_id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.createdDate = createdDate;
        this.isCustomer = isCustomer;
        this.isAdmin = isAdmin;
        this.isSuperAdmin = isSuperAdmin;
        this.isOnline = isOnline;
    }

    //Constructor without property Id
    public AppUser(String userName, String email, String password, String confirmPassword, LocalDate createdDate, Boolean isCustomer, Boolean isAdmin, Boolean isSuperAdmin, Boolean isOnline) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.createdDate = createdDate;
        this.isCustomer = isCustomer;
        this.isAdmin = isAdmin;
        this.isSuperAdmin = isSuperAdmin;
        this.isOnline = isOnline;
    }

    //Getters and setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getCustomer() {
        return isCustomer;
    }

    public void setCustomer(Boolean customer) {
        isCustomer = customer;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    //To String method for getting the value

    @Override
    public String toString() {
        return "AppUser{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", createdDate=" + createdDate +
                ", isCustomer=" + isCustomer +
                ", isAdmin=" + isAdmin +
                ", isSuperAdmin=" + isSuperAdmin +
                ", isOnline=" + isOnline +
                '}';
    }
}

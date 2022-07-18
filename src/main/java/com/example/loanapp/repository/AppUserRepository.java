package com.example.loanapp.repository;

import com.example.loanapp.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser,Integer> {
    //Search User JPQL Query Parameters
    @Query("SELECT u FROM AppUser u WHERE " + "u.username LIKE CONCAT('%',:query,'%')")
    List<AppUser> searchUsers(String query);
}

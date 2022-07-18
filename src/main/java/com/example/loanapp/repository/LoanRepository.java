package com.example.loanapp.repository;

import com.example.loanapp.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    @Query("SELECT l FROM Loan l WHERE " + "l.amount LIKE CONCAT('%',:query,'%')")
    List<Loan> searchLoans(String query);
}

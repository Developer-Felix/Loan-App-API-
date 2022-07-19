package com.example.loanapp.repository;

import com.example.loanapp.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    @Query(value="SELECT l FROM Loan_table l WHERE " + "l.amount LIKE CONCAT('%',:query,'%')", nativeQuery = true)
    List<Loan> searchLoans(String query);

    @Modifying
    @Query(value="update Loan_table l set l.amount = l.amount - :amount where l.id = :id" , nativeQuery = true)
    void updateLoanBalance(@Param(value = "id") Loan id, @Param(value = "amount") int amount);
}

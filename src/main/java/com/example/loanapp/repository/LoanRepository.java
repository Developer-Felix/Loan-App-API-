package com.example.loanapp.repository;

import com.example.loanapp.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoanRepository extends JpaRepository<Loan, Integer> {


//    @Modifying
//    @Query("update loan_table u set u.amount = u.amount - :amount where u.id = :id")
//    void updateLoanPayment(@Param(value = "id") int id, @Param(value = "amount") int amount);

}

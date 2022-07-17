package com.example.loanapp.repository;

import com.example.loanapp.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<Payment,Integer> {
}

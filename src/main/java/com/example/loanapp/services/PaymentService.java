package com.example.loanapp.services;

import com.example.loanapp.models.Loan;
import com.example.loanapp.models.Payment;
import com.example.loanapp.repository.LoanRepository;
import com.example.loanapp.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    private final PaymentsRepository paymentsRepository;

    private final LoanRepository loanRepository;

    @Autowired
    public PaymentService(PaymentsRepository paymentsRepository, LoanRepository loanRepository) {
        this.paymentsRepository = paymentsRepository;
        this.loanRepository = loanRepository;
    }

    public List<Payment> getPayments(){
        return paymentsRepository.findAll();
    }

    public void createPayment(Payment payment) {
        Loan loan_id = payment.getLoad_id();
        System.out.println("ID: " + loan_id);
        int amount = payment.getAmount();
        System.out.println("Amount: " + amount);
        System.out.println("createPayment"+payment.getAmount());

        Optional<Loan> loan = loanRepository.findById(loan_id.getId());
        System.out.println(loan);

        paymentsRepository.save(payment);
    }
}

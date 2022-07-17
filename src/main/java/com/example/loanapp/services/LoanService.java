package com.example.loanapp.services;

import com.example.loanapp.models.Loan;
import com.example.loanapp.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoanService {
    public final LoanRepository loanRepository;

    @Autowired
    public  LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

     public void createLoan(Loan loan){ System.out.println(loan);
     loanRepository.save(loan);
     }
public List<Loan> getLoanList(){

    return loanRepository.findAll();
}
}
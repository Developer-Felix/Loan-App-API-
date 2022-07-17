package com.example.loanapp.controllers;

import com.example.loanapp.models.Loan;
import com.example.loanapp.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping(path = "/loans")
    public List<Loan> getLoans() {
        return loanService.getLoanList();
    }

    @PostMapping(path = "/loan")
    public ResponseEntity<Object> createLoan(@RequestBody Loan loan){
        loanService.createLoan(loan);
        return ResponseEntity.ok().body("Loan created successfully");
    }
}

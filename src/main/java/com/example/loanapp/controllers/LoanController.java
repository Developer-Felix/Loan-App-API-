package com.example.loanapp.controllers;

import com.example.loanapp.models.AppUser;
import com.example.loanapp.models.Loan;
import com.example.loanapp.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "message" ,"Loan Created Successfully",
                 "status" ,HttpStatus.CREATED,
                "statusCode" ,"1"
        ));
    }

    @GetMapping(path="/loans/search")
    public ResponseEntity<List<Loan>> searchLoan(@RequestParam("query") String query){
        return ResponseEntity.ok(loanService.searchLoan((query)));
    }
}

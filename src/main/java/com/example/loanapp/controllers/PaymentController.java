package com.example.loanapp.controllers;

import com.example.loanapp.models.Payment;
import com.example.loanapp.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class PaymentController {
    public final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(path = "/payments")
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }

    @PostMapping(path = "/payment")
    public ResponseEntity<Object> createPayment(@RequestBody Payment payment){
        paymentService.createPayment(payment);
        return ResponseEntity.ok().body("Payment created successfully");
    }
}

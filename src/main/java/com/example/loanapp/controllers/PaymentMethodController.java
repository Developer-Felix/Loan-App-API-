package com.example.loanapp.controllers;

import com.example.loanapp.models.PaymentMethod;
import com.example.loanapp.services.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1")
public class PaymentMethodController {

    private final PaymentMethodService paymentMethodService;

    @Autowired
    public PaymentMethodController(PaymentMethodService paymentMethodService) {
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping(path= "/payment_method")
    public List<PaymentMethod> getPaymentMethods(){
        return
                paymentMethodService.getPaymentMethods();
    }

    @PostMapping(path="/payment_method")
    public ResponseEntity<Object> createPaymentMethod(@RequestBody PaymentMethod paymentMethod){
        paymentMethodService.createPaymentMethod(paymentMethod);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "message" ,"Payment Method created successfully",
                "status" ,HttpStatus.CREATED,
                "statusCode" ,"1"
        ));
    }
}

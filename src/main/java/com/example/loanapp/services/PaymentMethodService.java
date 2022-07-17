package com.example.loanapp.services;

import com.example.loanapp.models.PaymentMethod;
import com.example.loanapp.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {

    public final PaymentMethodRepository paymentMethodRepository;

    @Autowired
    public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<PaymentMethod> getPaymentMethods(){
        return paymentMethodRepository.findAll();
    }

    public void createPaymentMethod(PaymentMethod paymentMethod){
        System.out.println("createPaymentMethod: " + paymentMethod);
        paymentMethodRepository.save(paymentMethod);
        System.out.println(paymentMethod.getName());
    }
}

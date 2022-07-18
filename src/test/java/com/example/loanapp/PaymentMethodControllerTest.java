package com.example.loanapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class PaymentMethodControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetPaymentMethods() throws Exception {
        mvc.perform(get("/api/v1/payment-methods"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect((ResultMatcher) jsonPath("$.[0].name").value("Paypal"))
    }

}

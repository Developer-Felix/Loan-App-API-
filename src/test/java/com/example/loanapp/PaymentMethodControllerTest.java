package com.example.loanapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;

import java.sql.ResultSet;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PaymentMethodControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetPaymentMethods() throws Exception {
        ResultActions paypal = mvc.perform(get("/api/v1/payment_method"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect((ResultMatcher) jsonPath("$.[0].name").value("Paypal"));
    }

    @Test
    public void testGetPaymentMethodsByName() throws Exception {
        ResultActions paypal = mvc.perform(get("/api/v1/payment_method/Paypal"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect((ResultMatcher) jsonPath("$.[0].name").value("Paypal"));
    }

    @Test
    public void testGetPaymentMethodsByNameNotFound() throws Exception {
        ResultActions paypal = mvc.perform(get("/api/v1/payment_method/Paypal"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect((ResultMatcher) jsonPath("$.[0].name").value("Paypal"));
    }

    @Test
    public void testPostPaymentMethods() throws Exception{

    }

    @Test
    public void searchPaymentMethods() throws Exception{
        

    }


}

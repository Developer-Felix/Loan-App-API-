package com.example.loanapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AppUserControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetUsers() throws Exception {
        mvc.perform(get("/api/v1/users"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect((ResultMatcher) jsonPath("$.[0].username").value("Felix"))
                .andExpect((ResultMatcher) jsonPath("$.[0].password").value("123456"))
                .andExpect((ResultMatcher) jsonPath("$.[0].email").value("felix"));
        }

        @Test
        public void testGetUser() throws Exception {
            mvc.perform(get("/api/v1/users/1"))
                    .andExpect(status().isOk())
                    .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect((ResultMatcher) jsonPath("$.username").value("Felix"))
                    .andExpect((ResultMatcher) jsonPath("$.password").value("123456"))
                    .andExpect((ResultMatcher) jsonPath("$.email").value("felix"));
        }

        @Test()
        public void testSearchUser() throws Exception {
            mvc.perform(get("/api/v1/users/search?query=Felix"))
                    .andExpect(status().isOk())
                    .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect((ResultMatcher) jsonPath("$.[0].username").value("Felix"))
                    .andExpect((ResultMatcher) jsonPath("$.[0].password").value("123456"))
                    .andExpect((ResultMatcher) jsonPath("$.[0].email").value("felix"));
        }


}

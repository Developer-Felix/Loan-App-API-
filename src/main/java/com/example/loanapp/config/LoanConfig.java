package com.example.loanapp.config;

import com.example.loanapp.models.AppUser;
import com.example.loanapp.models.Loan;
import com.example.loanapp.repository.LoanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanConfig {
    @Bean
    CommandLineRunner commandLineRunner(LoanRepository loanRepository){
        return args -> {
//            Loan loan1 = new Loan(
//                    1,
//                    new int[]{
//                            1,
//                    },
//                    20
//            );
//            loanRepository.save(loan1);
        };
    }
}

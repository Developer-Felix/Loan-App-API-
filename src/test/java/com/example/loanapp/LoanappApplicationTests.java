package com.example.loanapp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class LoanappApplicationTests {

	@Test
	void contextLoads() {
	}

	Calculator testcalculator = new Calculator();

	@Test
	void addTwoNumbersTest(){
		int num1 = 100;
		int num2 = 100;

		int results = testcalculator.add(num1, num2);

		int expected = 200;

		assertThat(results).isEqualTo(expected);
	}

	class Calculator{
		int add(int a, int b){
			int results = a + b;
			return results;
		}
	}

}

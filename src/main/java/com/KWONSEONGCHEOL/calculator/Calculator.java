package com.KWONSEONGCHEOL.calculator;
import org.springframework.stereotype.Service;
/** fffff
 * */

@Service
public class Calculator {
	int sum(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int div(int a, int b) {
		return a / b;
	}
	int mul(int a, int b) {
		return a * b;
	}
}

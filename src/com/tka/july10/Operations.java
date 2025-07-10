package com.tka.july10;

public class Operations {

	static double num1 = 12;
	static double num2 = 4;
	static char operator = '+';

	 public static void startCalculator() {
		double result;

		if (operator == '+') {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		} else if (operator == '*') {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		} else if (operator == '/') {
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
			} else {
				System.out.println("Error: Cannot divide by zero.");
			}
		} else {
			System.out.println("Invalid operator!");
		}
	}
	 
}

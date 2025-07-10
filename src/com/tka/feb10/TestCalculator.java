package com.tka.feb10;

public class TestCalculator {

	public static void main(String[] args) {

		double actual_res = Calculator.addTwo(-2, 5);
		double expected_res = -3;

		if (actual_res == expected_res) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case Failed..");
		}

	}

}

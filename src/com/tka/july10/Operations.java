package com.tka.july10;

import java.time.LocalDate;
import java.time.Period;

public class Operations {

	public void tableof5() {
		int n = 5;

		for (int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(n + " x " + i + " = " + result);
		}
	}

	public void tableof10() {
		// prem
	}

	// add your task here

	public static int calculateAge(LocalDate birthDate) {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

}

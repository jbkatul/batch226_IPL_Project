package com.tka.july10;

import java.time.LocalDate;
import java.time.Period;

public class Operations {
	


	public static void tableof5() {
		System.out.println("Table of 5:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
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

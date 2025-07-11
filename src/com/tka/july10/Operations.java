package com.tka.july10;

import java.time.LocalDate;
import java.time.Period;

public class Operations {
	
	public void tableof5() {
		// nidhee
	}
	
	
	public static void tableof10(int no) {
		System.out.println("Table Of "+no);
		for(int i=1;i<=10;i++) {
			System.out.println(no+" x "+i+" = "+(no*i));
		}
	}
	
	// add your task here

	public static int calculateAge(LocalDate birthDate) {
	    return Period.between(birthDate, LocalDate.now()).getYears();
	}

}

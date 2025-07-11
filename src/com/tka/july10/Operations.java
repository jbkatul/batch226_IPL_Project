package com.tka.july10;

import java.time.LocalDate;
import java.time.Period;

public class Operations {
	
	public void tableof5() {
		// nidhee
	}
	public int add (int a, int b)
{
		
		// addition  of two
		// ud patil
	 return a+b;
}
	
	
	public void tableof10() {
		// prem
	}
	
	// add your task here

	public static int calculateAge(LocalDate birthDate) {
	    return Period.between(birthDate, LocalDate.now()).getYears();
	}

}

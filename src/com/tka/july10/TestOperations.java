package com.tka.july10;

import java.time.LocalDate;

public class TestOperations {

	public static void main(String[] args) {

		 Operations.startCalculator();
		
		System.out.println("Shubham's age is : " + Operations.calculateAge(LocalDate.of(2002, 5, 2))); 

		
	}

}

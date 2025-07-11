package com.tka.july10;

import java.time.LocalDate;

import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {

		Operations.tableof10(10);
		//		Test your task here
		
		Operations sum = new Operations();
		int num1 = 10;
		int num2 = 20;
		int result = sum.add(num1, num2);
		System.out.print(result);

		
		
		System.out.println("Shubham's age is : " + Operations.calculateAge(LocalDate.of(2002, 5, 2))); 

		Operations.Quiz();// Task Done By Tukaram
	}

}

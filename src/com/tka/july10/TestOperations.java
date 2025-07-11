package com.tka.july10;

import java.time.LocalDate;

public class TestOperations {

	public static void main(String[] args) {

		Operations.tableof10(10);
		//		Test your task here
		
		System.out.println("Shubham's age is : " + Operations.calculateAge(LocalDate.of(2002, 5, 2))); 

		Operations.Quiz();// Task Done By Tukaram
		String str=" The dog jumped over the fence to chase the butterfly.";
		System.out.println("\nVowels present in particular word : ");
		int number=Operations.countVowels(str);
		System.out.println("Number of Vowels in given string are: "+number);
	}

	}



package com.tka.july10;

import java.time.LocalDate;

public class TestOperations {

	public static void main(String[] args) {

<<<<<<< HEAD
		
		 Operations op=new  Operations();
		
		 System.out.println( " addition is  :" +op.add(12, 34));
//		Test your task here
=======
		Operations.tableof10(10);
		//		Test your task here
>>>>>>> cfac9c9e490d8f2fb7794d89445354cd5cabde78
		
		System.out.println("Shubham's age is : " + Operations.calculateAge(LocalDate.of(2002, 5, 2))); 

		Operations.Quiz();// Task Done By Tukaram
	}

}

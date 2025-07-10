package com.tka.Cacuator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Caculator c=new Caculator();
		System.out.println("Enter no 1");
		int a=sc.nextInt();
		System.out.println("Enter no 2");
		int b=sc.nextInt();
		System.out.println("Addtion "+c.Addtion(a, b));
		System.out.println("Substraction "+c.Substarion(a, b));
		System.out.println("Division "+c.Divison(a, b));
		System.out.println("Multiplication "+c.Multipication(a, b));
	}
}

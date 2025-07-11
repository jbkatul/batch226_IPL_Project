package com.tka.july10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Operations {

    // From taskbranch123
    static double num1 = 12;
    static double num2 = 4;
    static char operator = '+';

    public static void startCalculator() {
        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator!");
        }
    }

    // From main branch

    public void tableof5() {
        System.out.println("Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    public static void tableof10(int no) {
        System.out.println("Table Of " + no);
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " x " + i + " = " + (no * i));
        }
    }

    public static int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void Quiz() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!\n");

        System.out.println("Q1: What is the size of int in Java?");
        System.out.println("A. 4 bytes\nB. 2 bytes\nC. 8 bytes\nD. 1 byte");
        System.out.println("Enter Your Option");
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("A")) score++;

        System.out.println("\nQ2: Which keyword is used to create a subclass?");
        System.out.println("A. class\nB. extends\nC. implements\nD. inherits");
        System.out.println("Enter Your Option");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("B")) score++;

        System.out.println("\nQ3: What does JVM stand for?");
        System.out.println("A. Java Variable Machine\nB. Java Virtual Method\nC. Java Virtual Machine\nD. Java Verified Machine");
        System.out.println("Enter Your Option");
        String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("C")) score++;

        System.out.println("\nYour final score: " + score + "/3");

        sc.close();
    }
}



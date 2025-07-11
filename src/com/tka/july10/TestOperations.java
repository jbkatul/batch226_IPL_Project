package com.tka.july10;

import java.time.LocalDate;

public class TestOperations {

    public static void main(String[] args) {

        // From taskbranch123
        Operations.startCalculator();

        // From main
        Operations.tableof10(10);

        // Test age calculation
        System.out.println("Shubham's age is : " + Operations.calculateAge(LocalDate.of(2002, 5, 2)));

        // Run quiz
        Operations.Quiz(); // Task Done By Tukaram
    }
}

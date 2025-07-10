package com.tka.july10;

public class TestOperations {

	public static void main(String[] args) {

//		Test your task here
		Operations op = new Operations();
		int[] nums = {10, 25, 5, 30, 15};
		int maxValue = op.max(nums);
		System.out.println("Maximum number: " + maxValue);
	}

}

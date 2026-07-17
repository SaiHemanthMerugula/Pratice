package com;

public class Test5 {

	public static void main(String[] args) {

		int[] nums = { 2,2,1 };

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			index = index ^ nums[i];
		}
		System.out.println(index);

	}
}


package com;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int val=2;
		int[] nums= {3,2,2,3};
		
		int count =0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
			   nums[count] =nums[i];
			   count++;
			}
		}
		int[] newArray = Arrays.copyOf(nums, count);
		System.out.println(Arrays.toString(newArray));
	}
}

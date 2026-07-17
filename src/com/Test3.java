package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		Test3 test = new Test3();
		int[] nums = { 1, 3, 5, 6, 7};
//		int searchInsert = test.searchInsert(nums, 2);
//		System.out.println("Your index is :" + searchInsert);
		int searchInsert1 = test.searchInsert1(nums, 8);
		System.out.println("Your Index:"+searchInsert1);
//		int target = 7;
//
//		int outPut = 0;
//
//		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
//
//		for (int i = 0; i < nums.size(); i++) {
//			if (nums.get(i) == target) {
//				System.out.println("The outPut is:" +i);
//			}
//			
//			if(target < i) {
//		       nums.add(i, target);
//		       System.out.println("Your index is:"+i);
//		       break;
//			}
//		}
//	}
	}

	public int searchInsert(int[] nums, int target) {

		ArrayList<Integer> myNum = new ArrayList<>();
		int outPut = 0;

		for (int num : nums) {
			myNum.add(num);
		}
		for (int i = 0; i < myNum.size(); i++) {
			if (myNum.get(i) == target) {
				outPut = i;
				return outPut;
			} else if (myNum.get(i) > target) {
				myNum.add(i, target);
				outPut = i;
				return outPut;
			}

		}

		return outPut;
	}
	
	public int searchInsert1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]) 
               return i;
        }
        return nums.length;
    }
	
	
}

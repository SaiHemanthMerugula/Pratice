package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9));

		int target = 1;
		int lastIndex = nums.size() - 1;
		Integer index = nums.get(lastIndex);
	    target +=index;
        nums.remove(lastIndex);
        nums.add(target);
        int size = nums.size();
        int[] size2 =new int[size];
        System.out.println(size);
        for(int i = size-1 ; i>=0; i++) {
        	size2[i] = size %10;
        	size = size /10;
        }
		System.out.println(Arrays.toString(size2));
	}

}

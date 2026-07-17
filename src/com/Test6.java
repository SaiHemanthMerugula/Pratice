package com;

public class Test6 {

	public static void main(String[] args) {

		String s1= " a";
		String s= "   fly me   to   the moon  ";
		String s2= "luffy is still joyboy";

//		int index = s.lastIndexOf(" ");
//		System.out.println(index);
//		int length = s.length();
//		String trim = s.trim();
//		int length3 = trim.length();
//
//		if (length == trim.length()) {
//			int lastIndexOf = s.lastIndexOf(" ");
//			int length2 = (length - 1) - lastIndexOf;
//			System.out.println(length2);
//		} else if (length != length3) {
//			int length1 = (length - 1) - trim.length();
//			System.out.println(length1);
//		} else {
//			System.out.println(length3);
//		}
		
		  s = s.trim();
	        
	        int length = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) != ' ') {
	                length++;
	            }
	            else if (length > 0) {
	                break;
	            }
	        }
	        
	        System.out.println(length);
	}
}
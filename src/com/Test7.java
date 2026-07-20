package com;

public class Test7 {

	public static void main(String[] args) {

		String lastId =" ";

		System.out.println(lastId);

		int nextNumber = 1;
		try {
			if (lastId != null && lastId.startsWith("FLM-")) {
				int i =0;
				System.out.println(i);
				String numberPart = lastId.substring(4);
				nextNumber = Integer.parseInt(numberPart) + 1;
				System.out.println(String.format("FLM-%05d", nextNumber));
			}
			System.out.println(String.format("FLM-%05d", nextNumber));
		} catch (Exception e) {
			System.out.println("Invalid...");
		}finally {
			
		}
	}
}

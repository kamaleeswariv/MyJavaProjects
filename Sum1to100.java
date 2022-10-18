package com.looping;

public class Sum1to100 {

	public static void main(String[] args) {
		int i = 1, s = 0;
		while (i <= 100) {
			s = s + i;
			i = i + 1;

		}

		System.out.println("total of 1 to 100 natural numbers =" + s);
	}

}

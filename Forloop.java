package com.looping;

public class Forloop {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println("one to 100 natural numbers :" + i);
		}

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println("even numbers " + i);

		}
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.println("odd numbers " + i);

		}

		for (int i = 100; i >= 1; i = i - 1) {
			System.out.println("reverse order 100 to 1 :" + i);
		}

	}

}

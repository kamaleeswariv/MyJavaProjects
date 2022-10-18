package com.expe;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		float a, b, c = 0;
		System.out.println("ënter a,b:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextFloat();
		b = scan.nextFloat();
		System.out.println("before division");
		try {
			c = a / b;
		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println(e);
		}

		finally {
			System.out.println("finally");
		}
		System.out.println("c=" + c);
		System.out.println("After division");

	}

}

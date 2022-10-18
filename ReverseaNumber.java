package com.looping;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		int num, digit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		num = scan.nextInt();

		while (num != 0) {
			digit = num % 10;
			System.out.print(digit);
			num = num / 10;
		}
	}
}
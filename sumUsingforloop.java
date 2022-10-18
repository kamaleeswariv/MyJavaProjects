package com.looping;

import java.util.Scanner;

public class sumUsingforloop {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i = i + 2) {
			System.out.println("odd numbers " + i);

		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Inside while loop");
			System.out.println("Do you want continue(y/n)");
			char ch = scan.next().charAt(0);
			if (ch == 'n') {

				break;
			}
		}
	}

}

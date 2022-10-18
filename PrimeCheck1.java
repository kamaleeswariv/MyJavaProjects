package com.looping;

import java.util.Scanner;

public class PrimeCheck1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int num = scan.nextInt();
		int fc = 0;
		for (int i = 1; i <= num; i++) // 11,15 12,14
		{
			if (num % i == 0) // 11%1==0 && 15%1==0 1,2,3
			{
				fc++;
			}
		}

		if (fc == 2) {
			System.out.println("Numbers are Co-prime");
		} else {
			System.out.println("Numbers are not Co-prime");
		}

	}

}

package com.looping;

import java.util.Scanner;

public class FibonicSeries {

	public static void main(String[] args) {
		int terms, f1 = 1, f2 = 2, f3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Terms");
		terms =scan.nextInt();
		
		System.out.println("Fibonic Series");
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}

}

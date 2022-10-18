package com.looping;

import java.util.Scanner;

public class PrintFactorsSum {

	public static void main(String[] args) {
		int n,s=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Print factors:");
		System.out.println("Enter number");
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			s=s+i;
			}
		}
		System.out.println("print factors sum =" + s);
	}

}

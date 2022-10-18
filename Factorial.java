package com.looping;

public class Factorial {

	public static void main(String[] args) {
		int fact=1,num=100;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number is :"+ fact);
	}

}

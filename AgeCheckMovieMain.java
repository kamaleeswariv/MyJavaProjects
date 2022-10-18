package com.expe;

import java.util.Scanner;

public class AgeCheckMovieMain {
public static void checkAge(int age) {
	try {
		if(age<18) {
			throw new ArithmeticException("Not Eligible for voting");//"You are eligible for voting";
		}else {
			System.out.println("you are Eligible for voting");
		}
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
int prage;
Scanner scan = new Scanner(System.in);
System.out.println("Enter age");
prage =scan.nextInt();
checkAge(prage);

	}

}

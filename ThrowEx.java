package com.expe;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) {
int a,b,c=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the value of a");

a=scan.nextInt();
System.out.println("Enter the value of b");
b=scan.nextInt();
try {
	if(b==0) {
		throw new ArithmeticException("Divide by zero error");
		
	}//if ends
	else {
		c=a/b;
		System.out.println("Quotient of c: " +c);
	}
}//try ends
catch(ArithmeticException e) {
	e.printStackTrace();
}
	}

}

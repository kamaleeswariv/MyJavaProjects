package com.expe;

import java.util.Scanner;

class AgeCheckVoting extends Exception{
	public AgeCheckVoting(String s) {
		super(s);// call super(Exception) class constructor 
	}
}
class PersonAge{
	int age;
	void inputAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		try {
			if(age<18) {
				throw new AgeCheckVoting("Not eligible for voting");
			}else {
				System.out.println("Eligible for voting");
			}
		}catch(AgeCheckVoting e){
			e.printStackTrace();
		}
	}
}

public class CustomExceptionMain {

	public static void main(String[] args) {
		PersonAge ob=new PersonAge();
		ob.inputAge();
	}

}

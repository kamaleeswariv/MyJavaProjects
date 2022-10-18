package com.looping;

import java.util.Scanner;

public class Infiniteloop {

	

			public static void main(String[] args) {
				int i;
				Scanner sc=new Scanner(System.in);
				for(i=1;i<=10;i++); //creating delay
				System.out.println(i); //11
				
				//infinite for loop
				for(;;) {
					System.out.println("hello");
					System.out.println("Loop will not terminate, user should terminate");
					System.out.println("Do you want while loop to continue (y/n)");
					char ch=sc.next().charAt(0);
					if(ch=='n') {
						break; //breaks the loop
					}
				}
				
				
				//infinite while loop
			
				while(true) {
					System.out.println("Inside while loop");
					System.out.println("Do you want while loop to continue (y/n)");
					char ch=sc.next().charAt(0);
					if(ch=='n') {
						break; //breaks the loop
					}
				}

			}

		

	}



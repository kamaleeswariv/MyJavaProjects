package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIterator {

	public static void main(String[] args) {
ArrayList<Integer> array = new ArrayList<>();
Scanner scan = new Scanner(System.in);
System.out.println("How many elements you want to enter");
int n = scan.nextInt();
System.out.println("Enter :"+n+" roll number");
for(int i=0;i<n;i++) {
	int num =scan.nextInt();
	array.add(num);
}
System.out.println(array);

System.out.println("List elements are using for each loop");
for(int i:array) {//display enhanced for loop
	System.out.println(i);
} //using iterator
System.out.println("Using Iterator");
Iterator <Integer> itrate = array.iterator();
while(itrate.hasNext()) {
	System.out.println(itrate.next());
}
	}

}

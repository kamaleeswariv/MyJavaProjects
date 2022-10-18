package com.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemoList {

public static void main(String[] args) {
	//resizable array
ArrayList<Integer> array = new ArrayList<>();
array.add(20);
array.add(40);
array.add(30);
array.add(60);
array.add(50);
System.out.println(array);
//ArrayList iteration using enhanced for loop
for(int i:array) {
	System.out.println(i);
}
//declare one more arraylist which takes float values
ArrayList<Float> arr = new ArrayList<>();
arr.add(222.3f);
arr.add(312.3f);
arr.add(456.3f);
System.out.println(arr);
	
for(float i:arr) {
	System.out.println(i);
}

ArrayList<String> str = new ArrayList<>();
Scanner scan = new Scanner(System.in);
System.out.println("Enter number of students:");
int n = scan.nextInt();
System.out.println("enter "+ n + "name");
String name;
for(int i=0;i<n;i++) {
	name = scan.next();
	str.add(name);
}
str.add("kamalee");
str.add("anu");
str.add("nivi");
System.out.println(str);
	
for(String i:str) {
	System.out.println(i);
}

ArrayList<Double> dob = new ArrayList<>();

dob.add(263563d);
dob.add(7326d);
dob.add(4342376d);
System.out.println(dob);
	
for(Double i:dob) {
	System.out.println(i);
}

}
}



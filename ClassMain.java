package com.expe;

public class ClassMain {

	public static void main(String[] args) {
int a= 10, b=0,c= 0;
System.out.println("Before Division");
try {
	c=a/b;
}
catch(ArithmeticException e) {
	e.printStackTrace();
	System.out.println(e);
}
System.out.println("c= "+c);
System.out.println("After Division");
	}

}

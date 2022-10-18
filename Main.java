package com.inherit;
final class A1{
	final void m1() {
		System.out.println("final method");
	}
}
class B1{
	void m1() {
		//super.m1();
		System.out.println("B method");
	}
}
public class Main {

	public static void main(String[] args) {
B1 ob = new B1();
ob.m1();
	}

}

package com.inherit;
class Parent{
	void show() {
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Child class");
	super.show();
	}
}
public class FunctionOveriding {

	public static void main(String[] args) {
Child cob = new Child();
Parent pob = new Parent();
pob.show();
cob.show();
	}

}

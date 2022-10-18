package com.inherit;

class Base { // class can be use it will not extend and
				// method is private canot be overide
				// variable is final cant be change the value
	private int i;

	Base(int i) {
		this.i = i;
		System.out.println("the value of i " + i);
	}
}

class SubClass extends Base {
	SubClass(int j) {
		super(j);
	}
}

public class Constructorcalling {

	public static void main(String[] args) {
		SubClass sob = new SubClass(8);

	}

}

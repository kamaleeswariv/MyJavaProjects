package com.inter;
interface Myinterface{
	int i=35;
	void m1();
}
class Myclass implements Myinterface{
	String name ;
	@Override
	public void m1() {
		System.out.println("interface method implementation");
		System.out.println("the value of i is ="+i);
	}

	public void m2() {
		String name = "Kiran";
		System.out.println("Name = "+name);
	}
	
}
public class MainInterfaceClass {
//Myinterface ob1 = new Myinterface(); //error object creation is not possible for interdface
	public static void main(String[] args) {
		Myclass ob = new Myclass();
		ob.m1();
		ob.m2();
		Myinterface ob1 = new Myclass();
		ob1.m1();
	}

}

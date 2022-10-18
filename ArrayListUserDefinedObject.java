package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	 int sid;
	 String sname;
	 float salary;
	public Student(int sid, String sname, float salary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", salary=" + salary + "]";
	}
	
	
}
public class ArrayListUserDefinedObject {

	public static void main(String[] args) {
		Student std = new Student(1,"kamalee",54321.6f);
		Student std1= new Student(2,"Anu",8284.4f);
		Student std2 = new Student(3,"aishu",78237.f);
		Student std3 = new Student(4,"bavani",83487.f);
	ArrayList<Student> arr = new ArrayList<>();
	arr.add(std);
	arr.add(std1);
	arr.add(std2);
	arr.add(std3);
	System.out.println(arr);
//
	//Using Iterator
	Iterator<Student> sitor = arr.iterator();
	/*Sysntax:Iterator
	Iterator<classnmae>objname = arraylistobject(arr).iterator();
	for predefined Iterator<datatype> //datatype can be integer,float,string,double
		
	*/
	System.out.println("ID\tNaNAME\tFEES");
	while(sitor.hasNext()) { //returns object of student
		Student st1=sitor.next();
		System.out.println(std.sid+"\t"+std.sname+"\t"+std.salary);;
	}
	}

}

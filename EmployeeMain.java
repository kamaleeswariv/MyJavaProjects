package com.expe;
class EmployeeException extends Exception{
	public EmployeeException(String s) {
		super (s);//call super class(Exception) constructor
	}
}
class Employee{
	public void checkId(int eid) {//member function
		try {
			if(eid<=0||eid>999) {
				throw new EmployeeException(" Invalid Employee ID")
		;	}else {
			System.out.println("Employee id is invalid");
		}
		}catch(EmployeeException e) {
			e.printStackTrace();
		}
		
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		Employee eo = new Employee();
		eo.checkId(6);
	}

}

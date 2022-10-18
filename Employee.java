import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String e_name;
		int age;
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name");
		e_name = sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter Salary");
		salary = sc.nextFloat();

		System.out.println("Employee details");
		
		System.out.println("Name= " + e_name);
		System.out.println("Age= " + age);
		System.out.println("Salary= " + salary);

	}
	}



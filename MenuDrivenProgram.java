import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		int choice,num1,num2,res;
		System.out.println("***MENU***");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println("Enter Your Choice");
		Scanner scan = new Scanner(System.in);
		 choice=scan.nextInt();
		System.out.println("Enter first numbers");
		num1=scan.nextInt();
		System.out.println("Enter second numbers");

		num2=scan.nextInt();
		
		switch(choice) {
		case 1:res=num1+num2;
			System.out.println(" Sum of "+num1+" and "+num2+" is "+res);
			break;
		case 2:res=num1-num2;
		System.out.println(" Difference of "+num1+" and "+num2+" is "+res);
			break;
		case 3:res=num1*num2;
		System.out.println(" Product of "+num1+" and "+num2+" is "+res);
			break;
		case 4:if(num2==0) {
		System.out.println("Divide by zero error");
		}
		else {
			res=num1/num2;
			
			System.out.println(" Quotient of "+num1+" and "+num2+" is "+res);
			break;
		}		
		}
		
		
	}
}



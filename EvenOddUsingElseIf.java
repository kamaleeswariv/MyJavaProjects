import java.util.Scanner;

public class EvenOddUsingElseIf {
	
int num;
void inputNum() {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter number");
num=scan.nextInt();
}
	void checkEvenOdd() {
		if(num%2==0) {
			System.out.println(num+"even num");
		}
		else {
			System.out.println(num+" odd number");
		}
	}
	
	public static void main(String[] args) {
		EvenOddUsingElseIf ob=new EvenOddUsingElseIf();
		ob.inputNum();
		ob.checkEvenOdd();
		
	}

}

import java.util.Scanner;

public class CheckPositiverNegative {
	int num;
	void inputNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
	num=scan.nextInt();
	}
		void checkEvenOdd() {
			if(num>0) {
				System.out.println(num+"number is positive");
			}
			else {
				System.out.println(num+" number is negative ");
			}
		}
		
	public static void main(String[] args) {
		CheckPositiverNegative ob=new CheckPositiverNegative();
		ob.inputNum();
		ob.checkEvenOdd();
		
	}

}

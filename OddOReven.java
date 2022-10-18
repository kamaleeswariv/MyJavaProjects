import java.util.Scanner;

public class OddOReven {

	public static void main(String[] args) {
		int num1, choice;
		boolean res;
		System.out.println("Enter the numbers :");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();

		System.out.println("Enter Your Choice");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (num1 % 2 == 0) {
				System.out.println(" number is even number");
			} else {
				res = num1 % 2 != 0;
				System.out.println("number is odd number");
			}
		}
		scan.close();
	}
}
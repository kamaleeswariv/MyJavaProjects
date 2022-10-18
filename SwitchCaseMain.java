import java.util.Scanner;

public class SwitchCaseMain {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any int value between 1 to 5");
		num = scan.nextInt();
		switch (num) {

		case 1:
			System.out.println("Öne");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("invalid input");
		}
	}

}

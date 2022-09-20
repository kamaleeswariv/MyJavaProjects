import java.util.Scanner;

public class MonthOfTheYear {

	public static void main(String[] args) {
		String month;
		System.out.println("Enter a month");
		Scanner scan = new Scanner(System.in);
		month = scan.next();

		switch (month) {
		case "January":
			System.out.println("1st month of the year : " + month);
			break;
		case "February":
			System.out.println("2nd month of the year : " + month);
			break;
		case "March":
			System.out.println("3rd month of the year : " + month);
			break;
		case "April":
			System.out.println("4th month of the year : " + month);
			break;
		case "May":
			System.out.println("5th month of the year : " + month);
			break;
		case "June":
			System.out.println("6th month of the year : " + month);
			break;
		case "July":
			System.out.println("7th month of the year : " + month);
			break;
		case "August":
			System.out.println("8th month of the year : " + month);
			break;
		case "September":
			System.out.println("9th month of the year : " + month);
			break;
		case "October":
			System.out.println("10th month of the year : " + month);
			break;
		case "November":
			System.out.println("11th month of the year : " + month);
			break;
		case "December":
			System.out.println("12th month of the year : " + month);
			break;
		default:
		System.out.println("invalid data");
		}
	}

}

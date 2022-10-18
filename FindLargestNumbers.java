import java.util.Scanner;

public class FindLargestNumbers {
//	int num1, num2, num3;
//
//	void inputNum() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the first number");
//		num1 = scan.nextInt();
//		System.out.println("Enter the Second Number");
//		num2 = scan.nextInt();
//		System.out.println("Enter the third number");
//		num3 = scan.nextInt();
//	}
//
//	void checkGreaterNumber() {
//		if (num1>=num2 && num1 >=num3) {
//			System.out.println("Largest of" + num1 + "," + num2 + "and" + num3 + "ïs" + num1);
//
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("Largest of" + num1 + "," + num2 + "and" + num3 + "ïs" + num1);
//		}
//
//	}
//
	public static void main(String[] args) {
//		FindLargestNumbers ob = new FindLargestNumbers();
//		ob.inputNum();
//		ob.checkGreaterNumber();
			int fnum,snum,tnum;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter values:");
			fnum=sc.nextInt();
			snum=sc.nextInt();
			tnum=sc.nextInt();
			if(fnum>snum && fnum>tnum) {
				System.out.println("largest of  "+fnum+" , "+snum+" and "+tnum+" is"+fnum);
			}
	       
			else if(snum>fnum && snum>tnum) {
				System.out.println("largest of"+fnum+","+snum+"and"+tnum+" is"+snum);	
			}
			else {
				System.out.println("largest of"+fnum+","+snum+"and"+tnum+" is"+tnum);
			}
		}

	


	}



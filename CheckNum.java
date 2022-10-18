import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
int num;
Scanner scan = new Scanner (System.in);
System.out.println("Enter num:");
num =scan.nextInt();
if(num>0) {
	System.out.println("the number is positive");
}
if(num<0) {
	System.out.println("the number is negative");
	
}
if(num == 0) {
	System.out.println("the number is zero");
}
System.out.println("after if statement");
	}
	

}

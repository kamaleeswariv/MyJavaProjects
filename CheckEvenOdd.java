import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
int num;
Scanner scan = new Scanner(System.in);
System.out.println("Ënter the number");
num=scan.nextInt();
if(num%2==0) {
	System.out.println(num+" ïs even number ");
	}
if(num%2!=0) {
	System.out.println(num+" is Odd number ");
}
	}

}

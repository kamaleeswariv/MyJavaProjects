import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
int num;
Scanner scan = new Scanner(System.in);
System.out.println("�nter the number");
num=scan.nextInt();
if(num%2==0) {
	System.out.println(num+" �s even number ");
	}
if(num%2!=0) {
	System.out.println(num+" is Odd number ");
}
	}

}

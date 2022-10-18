import java.util.Scanner;

public class UserInputData {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
int i;
float f;
double d;
byte b;
short s;
char ch;
String fName;
System.out.println("Enter name");
String firstName = scan.next();
System.out.println("string value :"+ firstName);

System.out.println("enter intger value:");
i = scan.nextInt();
System.out.println("integervalue: "+ i);

System.out.println("Enter short int:");
s=scan.nextShort();
System.out.println("short int value: " + s);


System.out.println("enter byte");
b= scan.nextByte();
System.out.println("byte value: "+ b);


System.out.println("Enter float value");
f=scan.nextFloat();
System.out.println("float values are: "+f);


System.out.println("Enter double");
d=scan.nextDouble();
System.out.println("double value: "+ d);

System.out.println("enter character");
ch=scan.next().charAt(0);
System.out.println("character value: "+ch);

	}

}

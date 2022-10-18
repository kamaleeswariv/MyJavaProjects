import java.util.Scanner;

public class compareCharacter {

	public static void main(String[] args) {
char ch;
System.out.println("Enter a character");
Scanner scan = new Scanner(System.in);
ch = scan.next().charAt(0);
if (ch =='a') {
	System.out.println("charcter is vowel");
} else if (ch =='e') {
	System.out.println("charcter is vowel");
} else if (ch =='i') {
	System.out.println("charcter is vowel");
} else if (ch =='o' ) {
	System.out.println("charcter is vowel");
}
else if (ch =='u' ) {
	System.out.println("charcter is vowel");
}
else {
	System.out.println("character is consonant");
}
	}

}

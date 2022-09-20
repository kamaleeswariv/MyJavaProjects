import java.util.Scanner;

public class CharaterCheckOROperator {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("charcter is vowel");
		} else   {
			System.out.println("charcter is consonant");
		}
		scan.close();
	}

}

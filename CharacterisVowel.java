import java.util.Scanner;

public class CharacterisVowel {

	public static void main(String[] args) {

		char ch;
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);

		switch (ch) {

		case 'a':
			System.out.println("the character is vowel : " + ch);
			break;

		case 'e':
			System.out.println("the character is vowel : " + ch);
			break;

		case 'i':
			System.out.println("the character is vowel : " + ch);
			break;
		case 'o':
			System.out.println("the character is vowel : " + ch);
			break;
		case 'u':
			System.out.println("the character is vowel : " + ch);
			break;
		default:
			System.out.println("the character is consonant: " + ch);
		}
	}

}

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		String str = new String();
		int count = 0;
		int wc = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter sentence");
		str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				wc++;
			}
		}
		System.out.println("number of words = " + (wc + 1));

		// Reverse the Sentence

		System.out.println("Reverse Sentence ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}

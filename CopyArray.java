import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int firstarray[] = new int[5]; // input or store elements in first array
										// copy into secondary array and display secondary

		int secondarray[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter array elements");
		for(int i=0;i<firstarray.length;i++) {
			firstarray[i] = scan.nextInt();
		}
		//copying array elements
		for(int i=0;i<firstarray.length;i++) {
			secondarray[i]=firstarray[i];
		}
		//display secondaryarray
		System.out.println("Copied elements");
		for(int i:secondarray) {
			System.out.println(i);
		}
		//Using clone another method to copy elements
		secondarray = firstarray.clone();
		for(int i:secondarray) {
			System.out.println(i);
		}
//		System.out.println(secondarray);
	}

}

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+a.length+"elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Using enhanced for loop display array elements:");
		for(int k:a) {
			System.out.println(k);
		}
		
	}

}

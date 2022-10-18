import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int array[] = new int[5];
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		
		//input the array elements
		System.out.println("Enter the "+array.length+" elements");
		for(int i=0;i<array.length;i++) {
			array[i]=scan.nextInt();
		}
		
		//display
		System.out.println("Array elements are");
		for(int i:array) {
			System.out.println(i);
		}
		
		//sum all array elements
		for(int i=0;i<array.length;i++) {
			sum = sum+array[i];
		}
		System.out.println("Total of array elements ="+ sum);
	
	//max of array elements
	int max = array[0];
	for(int i=1;i<array.length;i++) {
		if(array[i]>max) {
			max = array[i];
		}
	}
	System.out.println("Maximum elements ="+max);
	//Min of Array elements
	int min = array[0];
	for(int i=1;i<array.length;i++) {
		if(array[i]<min) {
			min = array[i];
		}
		System.out.println("Minimum of elements ="+min);
	
	}
	}
}



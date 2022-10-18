import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
//		int i,j,k,lar;
//		i=1;j=5;k=2;
//		lar= (i>j&&i>k)?i:(j>i&&j>k)?:k;
		int fNum, sNum,tNum,f_Num, lar;
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter two numbers");

		//System.out.println("Enter three numbers:");
		
		System.out.println("Enter four numbers:");

		fNum = scan.nextInt();
		sNum = scan.nextInt();
		tNum = scan.nextInt();
		f_Num = scan.nextInt();
		
		lar=(fNum>sNum&&fNum>tNum&&fNum>f_Num)?fNum:(sNum>fNum&&sNum>tNum&&sNum>f_Num)?tNum:f_Num;
		System.out.println("The largest of " + fNum + " and " + sNum + " and "+ tNum + " and "+ f_Num +" is : "  + lar);
		
		//lar=(fNum>sNum&&fNum>tNum)?fNum:(sNum>fNum&&sNum>tNum)?sNum:tNum;
		//System.out.println("The largest of " + fNum + " and " + sNum + " and "+ tNum + " is : "  + lar);

		//		lar = (fNum > sNum) ? fNum : sNum;
//		System.out.println("The largest of " + fNum + " and " + sNum + " is :" + lar);

	}

}

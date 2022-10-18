
public class UnaryOperator {

	public static void main(String[] args) {
		int k,j;
		k=2;
		j=k++; //post increment
		
		System.out.println("=j"+j);
		System.out.println("k="+k);
		
		j=++k;
		System.out.println(" pre  j="+j);
		System.out.println("pre k="+k);
	}

}

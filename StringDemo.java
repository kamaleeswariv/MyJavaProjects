
public class StringDemo {

	public static void main(String[] args) {
		StringBuffer sob = new StringBuffer("MUTHU");
System.out.println("Revese String ");
sob.reverse();
System.out.println(sob);
sob.append("hi");
System.out.println("After adding a word "+sob);
sob.insert(3, "Edu");
System.out.println("After Insert "+sob);
	}
}

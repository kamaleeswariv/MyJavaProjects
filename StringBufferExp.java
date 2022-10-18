
public class StringBufferExp {

	public static void main(String[] args) {
StringBuffer str = new StringBuffer("cooking");
str.append("emerging");
System.out.println(str);

str.insert(2, "technology");
System.out.println(str);

str.replace(8, 16, "IOT");
System.out.println(str);

str.reverse();
System.out.println(str);

System.out.println(str.capacity());

	}

}


public class StringMethods {

	public static void main(String[] args) {
String a = "cooking";
System.out.println("String a="+a);
String b= new String("iot");
System.out.println("String b="+b);
System.out.println("length of the string");
System.out.println(a.toUpperCase());
System.out.println(a.toLowerCase());
System.out.println(a+b);
System.out.println(a.concat(b));
System.out.println("Character at position 5:"+a);
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.compareTo(b));
System.out.println(a.contains("x"));
	}

}

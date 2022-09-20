import java.util.Scanner;

class Function {

	int choice;
	double area;
	float length, breadth, base, height, radius;

	Scanner scan =new Scanner(System.in);
	public void areaOfSquare() {
		System.out.println("Enter length of Square");
		length = scan.nextFloat();
		area = length * length;
		System.out.println("area of Square " + area );
	}

	public void areaOfRectangle() {
		System.out.println("Enter length");
		length = scan.nextFloat();
		System.out.println("Enter Breadth");
		breadth = scan.nextFloat();
		area = breadth * length;
		System.out.println(" area of rectangle: " + area);


	}

	public void areaOfTriangle() {
		System.out.println("Enter base ");
		base = scan.nextFloat();
		System.out.println("Enter height ");
		height = scan.nextFloat();
		area = (base * height) / 2;

		System.out.println("area of Triangle is: " + area);

	}

	public void areaOfCircle() {
		System.out.println("Enter Radius");
		radius = scan.nextFloat();
		area = 3.14159 * radius * radius;
		System.out.println("Area of the circle is :" + area);

	}

}

public class Area {

	public static void main(String[] args) {
		Function area = new Function();

		System.out.println("*** MENU ***");
		System.out.println("1.Area Of Square");
		System.out.println("2.Ärea of Reactangle");
		System.out.println("3.Area of Traingle");
		System.out.println("4.Area of Circle");
		System.out.println("Enter Your Choice");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		switch (choice) {

		case 1:
			area.areaOfSquare();
			break;
		case 2:
			area.areaOfRectangle();
			break;
		case 3:
			area.areaOfTriangle();
			break;
		case 4:
			area.areaOfCircle();
			break;

		}

	}
}
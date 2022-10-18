
class MarksOfStudent {
	int science;
	int social;
	int maths;
}

public class SubjectMark {
	public static void main(String[] args) {
		MarksOfStudent marks = new MarksOfStudent();
		marks.maths = 70;
		marks.science = 80;
		marks.social = 90;
		MarksOfStudent mark2 = new MarksOfStudent();
		mark2.maths = 60;
		mark2.science = 70;
		mark2.social = 80;
		System.out.println("Marks of First student ");
		
		System.out.println("science : " + marks.maths);
		System.out.println("maths : " + marks.science);
		System.out.println("social : " + marks.social);
		
		
		System.out.println("Marks of Second student ");
		System.out.println("science : " + mark2.maths);
		System.out.println("maths : " + mark2.science);
		System.out.println("social : " + mark2.social);


	}

}

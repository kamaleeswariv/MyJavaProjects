import java.util.ArrayList;
import java.util.List;

public class RemoveDulicateElements {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(40);
		num.add(30);
		num.add(50);
		num.add(40);
		num.add(30);
		System.out.println("Array List" + num);

		System.out.println("New Array List");
//create new array list
		List<Integer> newlist = new ArrayList<>();
		for (Integer e : num) {
			if (!newlist.contains(e)) {
				newlist.add(e);

			}
		}
		System.out.println("After removing duplicates:" + newlist);
		for (Integer s: newlist) {
			System.out.println("After removing duplicates:" + s);
		}
	}

}

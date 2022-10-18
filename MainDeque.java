import java.util.ArrayDeque;

public class MainDeque {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.addFirst("kamalee");
		System.out.println("first element :" + deque);
		deque.addFirst("Anu");
		System.out.println("After adding the next element in  front of the deque : " + deque);
		deque.add("Aishu");
		System.out.println(" final deque  : " + deque);
		int size = deque.size();
		System.out.println("Number of elements : " + size);
		deque.removeLast();
		System.out.println(" removing the last element :  " + deque);

	}

}

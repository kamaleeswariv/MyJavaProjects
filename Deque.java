import java.util.ArrayDeque;

public class Deque {  
  public static void main(String[] args) {  
	  ArrayDeque<Integer> deque = new ArrayDeque<Integer>();  
    deque.add(11);  
    deque.add(22);  
    deque.add(33);  
    System.out.println("Insert thre elements : ");  
    for (Integer i : deque) {  
    System.out.println(i);      
    }  
    deque.push(2);
    deque.push(44);
    deque.pop();
    System.out.println("After popping : ");  
    for (Integer i : deque) {  
        System.out.println(i);  
    }  
    deque.remove(3);  
    System.out.println("Removing the element  :"+deque);  
  }  
}  

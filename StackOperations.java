package com.edu;

import java.util.Iterator;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
Stack<Integer> sob = new Stack<Integer>();
sob.push(10);
sob.push(20);
sob.push(30);
sob.push(40);
sob.push(50);
//last In First Out
System.out.println(sob);
System.out.println("Stack pop operation : "+sob.pop());

	//Iterator
Iterator<Integer> it =  sob.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	
	}

}

package com.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceClasses {

	public static void main(String[] args) {
Set<Integer> sob = new HashSet<Integer>();
sob.add(30);
sob.add(80);
sob.add(30);
sob.add(40);
sob.add(40);

sob.add(null);
sob.add(null);

System.out.println("HashSet:"+sob);

// linked hash set
Set<Integer> lhs = new LinkedHashSet<Integer>();
lhs.add(10);
lhs.add(20);
lhs.add(50);
lhs.add(40);
lhs.add(40);

lhs.add(null);

System.out.println("LinkedHashSet:"+lhs);


Set<Integer> ts = new TreeSet<Integer>();
ts.add(90);
ts.add(80);
ts.add(30);
ts.add(10);
//ts.add(null);

System.out.println("TreeSet:"+ts);
Iterator<Integer> it= ts.iterator();
while(it.hasNext()) {
	System.out.println(it.next());

	
}

	}

}

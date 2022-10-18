package com.edu;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//how to get entry set from hashmap?
public class HashmapGetKeys {

	public static void main(String[] args) {
HashMap<String,String> hm = new HashMap<String,String>();
//add Key-Value pair to hashmap
hm.put("first", "First inserted");
hm.put("Second", "Second inserted");
hm.put("Third", "Third inserted");
System.out.println(hm);
//getting values for the given key from hashmap
//syntax
//set<Entry<<KeyDataType,valueDatatype>> obj=mapobj.entryset();
Set<Entry<String,String>> entry= hm.entrySet();
for(Entry<String,String> ent:entry) {
	System.out.println(ent.getKey()+"==> "+ent.getValue());
}
	}

}

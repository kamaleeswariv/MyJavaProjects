package com.edu;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

		 
	    public static void main(String a[]){
	        Map<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        //getting value for the given key from hashmap
	        System.out.println("Value of second: "+hm.get("second"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        hm.remove("third");
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());
	    }
	}

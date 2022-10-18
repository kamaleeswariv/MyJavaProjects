package com.edu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
        System.out.println("Linked hash map:");

		Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(11,"kamalee");
        hm.put(12,"Anu");
        hm.put(15,"Nivi");
        hm.put(13,"Aishu");
        System.out.println(hm);
        
        System.out.println(" Hash map:");

		Map<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(11,"kamalee");
        hm1.put(12,"Anu");
        hm1.put(15,"Nivi");
        hm1.put(13,"Aishu");
        System.out.println(hm1);
        
        System.out.println(" Tree Hash map:");

		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.put(11,"kamalee");
		hm2.put(12,"Anu");
		hm2.put(15,"Nivi");
		hm2.put(13,"Aishu");
		hm2.put(13, "Thanu");
        System.out.println(hm2);
        
	}

}

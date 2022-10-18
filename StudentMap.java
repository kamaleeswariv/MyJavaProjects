package com.edu;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentMap {

	public static void main(String[] args) {
		Map<Long, String> hm2 = new TreeMap<Long, String>();
		hm2.put(9489526451L,"kamalee");
		hm2.put(9787273316L,"Anu");
		hm2.put(9025948856L,"Nivi");
		hm2.put(9787273316L,"Aishu");
		hm2.put(3456678123L, "Thanu");
        System.out.println(hm2);
        
	

	}

}

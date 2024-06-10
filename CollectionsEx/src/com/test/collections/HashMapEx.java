package com.test.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx { 

	 public static void main(String[] args) {
		 
	 
	//unsorted unordered
	Map<String,Integer> map= new HashMap<>();
	 map.put("Meghana", 10);
     map.put("Viva", 30);
     map.put("Sneha", 20);
     map.put("M", 20);
     
     System.out.println(map.get("Viva"));
     System.out.println(map.size());
     System.out.println(map);
}
	 
}

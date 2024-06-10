package com.test.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "I can do it." + "I will do it.";
		
		Map<Character,Integer> occurances = new HashMap<>();
		char[] chars=str.toCharArray();
		for(char character:chars) {
			Integer integer=occurances.get(chars);
			if(integer==null) {
				occurances.put(character, 1);
			}else {
				occurances.compute(key, value)
			}
		}

	}

}

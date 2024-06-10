package com.test.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
	
		list.add(10);
		list.add(20);
		list.add(80);
		System.out.println(list);
		//System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, "Apple","Banana","Orange");
		//System.out.println(list1);
		for(String i:list1) {
			if(i.contains("na")) {
				System.out.println(i);
			}
				
		}
		ArrayList list2 = new ArrayList();
		Collections.addAll(list2, "elements",'A',1,1.4);
		System.out.println(list2);
		
	}

}

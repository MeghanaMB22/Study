package com.test.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLenghtComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return compareAnimals(o1,o2);
		//return Integer.compare(o1.length(), o2.length());
	}
	private int compareAnimals(String o1, String o2) {
		if(o1.length()==o2.length()) {
			return Integer.compare(o1.charAt(0), o2.charAt(0));
			
		}else {
			return Integer.compare(o1.length(), o2.length());
		}
		//return Integer.compare(o2.length(), o1.length());
		
	}
}
public class ExQueue {
	
	
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLenghtComparator());
		Collections.addAll(queue,"Zebra","Map","Cat","Lion","Tiger","Monkey","Elephant","Dog");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
//		System.out.println(queue);
//		System.out.println(queue.peek());
//		queue.remove("Cat");
//		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue);
//		//queue.remove("Dog");
//		System.out.println(queue.peek());
//		//queue.remove("Elephant");
//		System.out.println(queue.poll());
//		System.out.println(queue);
		
	}
	
//

	
	
}

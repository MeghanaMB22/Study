package com.test.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExHashset {
	public static void main(String[] args) {
		Set<Integer> numbers = new LinkedHashSet<Integer>(); // HashSet - not sorted order, LinkedHashSet - Sorted but cannot store duplicate
		numbers.add(3);
		numbers.add(387);
		numbers.add(178);
		numbers.add(2);
		
		numbers.add(1948);
		System.out.println(numbers);
		
		Set<Integer> n = new TreeSet<Integer>(); //TreeSet sorted order and no duplicates.
		n.add(3);
		n.add(387);
		n.add(178);
		n.add(2);
		System.out.println(n);
		
		List<Character> Ch = new ArrayList<Character>();
				Collections.addAll(Ch,'Z','M','P','V','Z');
				
				Collections.sort(Ch);
				System.out.println(Ch);
				
				
				//_________ Sorted and unique__________
				Set<Character> CharactersSorted = new TreeSet<Character>();
				Collections.addAll(CharactersSorted,'Z','M','P','A');
				
				System.out.println(CharactersSorted);
				
				//_______________Lower nos_____________
				
				TreeSet<Integer> n1 = new TreeSet<Integer>();
				Collections.addAll(n1,2,1,2,7,8,5,5);
				//((TreeSet<Integer>) n1).lower(5);
				System.out.println(n1.lower(5));
				System.out.println(n1.headSet(5));
				System.out.println(n1.tailSet(5));
				System.out.println(n1);


	}
		
}

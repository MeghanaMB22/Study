package com.test.collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListNoDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,5,6,3,4,7,7);
		System.out.println("list with duplicates"+list);
		Set<Integer> listunique=new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(listunique);
		System.out.println("list without duplicates"+list);
		Collections.sort(list);
		System.out.println("Sorted"+list);
		Collections.reverse(list);
		System.out.println("Reverse"+list);
		
		Set<Integer>revised=list.stream().map(x->x+2).collect(Collectors.toSet());
		System.out.println("Set with stream"+revised);
		
		List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		System.out.println(nums);
		
		
		
		//________________________Streams________________
		
//		double avg=nums.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
//		System.out.println(avg);
		
		//______________Streams to convert upper case lower case_________________
		List<String> s=Arrays.asList("Red","MeGHANA","PinK","GREEN");
		List<String>uppercase=s.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
		
		//________________Sum of all even / odd nums
		
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		int even=num.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(even);
		
		//__________________Remove duplicates from list using streams_____________
		
		List<Integer> dup=Arrays.asList(1,2,3,4,4,3,2,1,4,6,7,8);
		List<Integer> unique=dup.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		// double all integer values in list
		List<Integer> num2=Arrays.asList(1,2,3,4,4,3,2,1,4,6,7,8);
		List<Integer> mul=num2.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println("double of all integers"+mul);
		
		//__________ 2nd smallest and largest
		List<Integer> num1=Arrays.asList(1,2,3,4,5,6,7,8,3,4);
		Integer sm=num1.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println("2nd smallest is : "+sm);
		Integer sl=num1.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
		System.out.println(sl);
	}

}

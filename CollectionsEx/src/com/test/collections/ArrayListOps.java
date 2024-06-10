package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOps {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		Collections.addAll(num,1,2,3,4,5,6,7);
		num.remove(Integer.valueOf(2));//to remove value
		System.out.println(num);
		Collections.reverse(num);
		System.out.println("After reverse "+num);
		num.remove(3);//Removes index 3
		System.out.println(num);
		//update
		num.set(1, 10);
		System.out.println(num);
		try {
			num.remove(Integer.MAX_VALUE);
			System.out.println("numbers are"+num);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
		}
	}

}

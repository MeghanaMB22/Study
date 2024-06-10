package com.test.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] Arr1= {1,2,3,4,5,6};
		int[] Arr2= {9,4,5,10,0,6};
		for(int i=0;i<Arr1.length;i++){
			for(int j=0;j<Arr2.length;j++) {
				if(Arr1[i]==Arr2[j])
					System.out.println("Common num are"+i);
			}
		}

	}

}

package com.test.collections;
import java.util.*;
public class UserInputExamples {

	public static void main(String[] args) {
		try {
		List<Integer> list=readnum();
		if(num>10) 
			System.out.println("Exception");
		
		catch(Exception e) {
			
		}
		
	}

	public static List<Integer> readnum() {
		List<Integer> num= new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input the integers");
		int readnum=scanner.nextInt();
		return readnum();
		
		
	}

}

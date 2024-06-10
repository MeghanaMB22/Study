package com.test.collections;


@FunctionalInterface  
interface Sum{
	int sum(int x,int y);
}
public class Lambda_Exp {

	
	public static void main(String[] args) {
		
		Sum s1 = (x, y) -> (x+y);
		{System.out.println(s1.sum(9,9));};
	}
	

}

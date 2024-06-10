package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class HighSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {   //compare() method used in comparator
		
		return Double.compare(emp1.getSalary(),emp2.getSalary());
	}
	
}

class IdSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return Double.compare(emp1.getId(),emp2.getId());
	}
	
}

public class EmployeeExComparator {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee( 2,"Meghana",2000000));
		emp.add(new Employee( 3,"Viva",3000000));
		emp.add(new Employee( 1,"Sneha",2500000));
		
		ArrayList<Employee> emp1 = new ArrayList<>(emp);
		
		emp1.sort(new IdSorting());
		System.out.println("Sorting as per id"+emp1);

		//Collections.sort(emp1);
		
		emp1.sort(new HighSalary() );
		System.out.println("Highest salary sorting"+emp1);
	}

}

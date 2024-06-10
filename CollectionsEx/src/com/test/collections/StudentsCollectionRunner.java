package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Meghana"));
		
		students.add(new Student(3,"Viva"));
		
		students.add(new Student(2,"Saru"));
		
		
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		
		
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
	}

}

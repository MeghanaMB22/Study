package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Value("Meghana Bhandari")
	private String studentName;
	@Value("Sangli")
	private String city;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}

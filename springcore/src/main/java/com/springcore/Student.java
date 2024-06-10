package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studsentName) {
		this.studentName = studsentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	//Generated to string to get output in form of string and not hashcode
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	//Generated constructor
	public Student(int studentId, String studsentName, String studentAddress, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	//const using super 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

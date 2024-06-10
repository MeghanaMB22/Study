package com.stream.api;
import java.util.List;

public class Employee {

	private String f_name;
	private String l_name;
	private Double salary;
	private List<String> projects;
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Employee(String f_name, String l_name, Double salary, List<String> projects) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.salary = salary;
		this.projects = projects;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [f_name=" + f_name + ", l_name=" + l_name + ", salary=" + salary + ", projects=" + projects
				+ "]";
	}
	
}

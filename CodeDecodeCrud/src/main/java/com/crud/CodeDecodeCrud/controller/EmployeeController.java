package com.crud.CodeDecodeCrud.controller;
//import com.crud.CodeDecodeCrud.repos.EmployeeCrudRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.CodeDecodeCrud.entity.Employee;
import com.crud.CodeDecodeCrud.repos.EmployeeCrudRepo;
import com.crud.CodeDecodeCrud.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeServiceInterface.addEmployee(employee); //calling addEmployee method from service interface
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> listOfAllEmps = employeeServiceInterface.getAllEmployees();
		return new ResponseEntity<List<Employee>>(listOfAllEmps,HttpStatus.OK);  //2 returns - one is list of employee and another for status code
	}
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("empid") Long empidL){
		Employee empRetrived = employeeServiceInterface.getEmpById(empidL);
		return new ResponseEntity<Employee>(empRetrived,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable("empid") Long empidL){
		employeeServiceInterface.deleteEmpById(empidL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		
	}
}

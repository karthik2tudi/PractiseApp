package com.ratnaGlobal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ratnaGlobal.Entity.Employee;
import com.ratnaGlobal.Service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired(required = true)
	EmployeeService empService;

	@PostMapping(value = "/addemployee")
	private Employee CreateEmployee(@RequestBody Employee employee) {
		empService.saveOrUpdate(employee);
		return employee;

	}

	@GetMapping("/getemployees")
	private List<Employee> getAllEmployees() {
		return empService.listAll();
	}

	@GetMapping("/employee/{employeeid}")
	private Employee GetEmpById(@PathVariable("employeeid") int employeeid) {
		return empService.getById(employeeid);
	}

	@PutMapping("/updateemployee")
	private Employee update(@RequestBody Employee employee) {
		empService.saveOrUpdate(employee);
		return employee;
	}

	@DeleteMapping("deleteemployee/{employeeid}")
	private void deleteBook(@PathVariable(value = "id") int employeeId) {
		empService.delete(employeeId);
	}
}

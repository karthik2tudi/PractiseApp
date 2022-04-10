package com.ratnaGlobal.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ratnaGlobal.Entity.Employee;
import com.ratnaGlobal.Repository.EmployeeRepository;
@Service
public class EmployeeService {

     @Autowired
	 EmployeeRepository empRepository;
	
	public List<Employee> listAll(){
		List<Employee> employees = new ArrayList<Employee>();
		empRepository.findAll(); 
		return employees;
    }
	public Employee getById(int id) {
		return empRepository.findById(id).get();
	}
	public void saveOrUpdate(Employee employee) {
		empRepository.save(employee);
		//areturn employee;
			}
	public void delete(int id) {
		empRepository.deleteById(id);
	}
}

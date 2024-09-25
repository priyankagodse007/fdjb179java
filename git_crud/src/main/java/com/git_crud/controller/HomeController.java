package com.git_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git_crud.ServiceI.EmployeeServiceI;
import com.git_crud.model.Employee;

@RestController
public class HomeController {
	@Autowired
	EmployeeServiceI es;
@PostMapping("/save")
public String saveEmployee(@RequestBody Employee e) {
es.save(e);
return "saved data";	
}
	@GetMapping("/getall")
	public List<Employee> getall()
	{
		List<Employee> list=es.getall();
		return list;
	}
}

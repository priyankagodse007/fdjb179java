package com.git_crud.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git_crud.ServiceI.EmployeeServiceI;
import com.git_crud.model.Employee;
import com.git_crud.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
@Autowired
EmployeeRepository ep;
	@Override
	public void save(Employee e) {
	ep.save(e);	
		
	}

}

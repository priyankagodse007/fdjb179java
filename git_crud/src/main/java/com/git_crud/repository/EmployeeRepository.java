package com.git_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git_crud.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

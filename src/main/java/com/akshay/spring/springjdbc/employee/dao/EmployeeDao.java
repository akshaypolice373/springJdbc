package com.akshay.spring.springjdbc.employee.dao;

import com.akshay.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(Employee employee);
}

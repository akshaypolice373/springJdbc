package com.akshay.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.akshay.spring.springjdbc.employee.dao.EmployeeDao;
import com.akshay.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/akshay/spring/springjdbc/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Akilesh");
		employee.setLastName("Kumar");
//		int result = dao.create(employee);
		
//		int result = dao.update(employee);
		
		int result = dao.delete(employee);
		System.out.println("Number of records deleted " + result);
	}

}

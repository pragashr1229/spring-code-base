package com.spring.demo.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(102, "Amit", 35000));
		System.out.println(status);

		int updatestatus = dao.updateEmployee(new Employee(102, "Sonoo", 15000));
		System.out.println(updatestatus);

		Employee e = new Employee();
		e.setId(102);

		/*
		 * int deleteStatus = dao.deleteEmployee(e); System.out.println(deleteStatus);
		 */

		Boolean status1 = dao.saveEmployeeByPreparedStatement(new Employee(102, "Amit", 35000));
		System.out.println(status1);

		List<Employee> employeeList = dao.getAllEmployees();
		System.out.println("employeeList " + employeeList);
		


	}
}
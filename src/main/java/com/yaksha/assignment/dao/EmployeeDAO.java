package com.yaksha.assignment.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yaksha.assignment.models.Employee;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// Insert Employee
	public void insertEmployee(Employee employee) {
		//Write you logic here:
	}

	// Retrieve all employees
	public List<Employee> getAllEmployees() {
		//Write you logic here:
	}

	// Retrieve employee by ID
	public Employee getEmployeeById(int id) {
		//Write you logic here:
	}
}

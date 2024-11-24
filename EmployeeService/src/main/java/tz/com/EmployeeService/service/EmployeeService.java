package tz.com.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import tz.com.EmployeeService.model.Employee;

public interface EmployeeService {
	    List<Employee> getAllEmployees();

	    Optional<Employee> getEmployeeById(Long id);

	    Employee createEmployee(Employee employee);

	    Optional<Employee> updateEmployee(Long id, Employee employee);

	    boolean deleteEmployee(Long id);

}

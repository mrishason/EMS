package tz.com.EmployeeService.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tz.com.EmployeeService.model.Employee;
import tz.com.EmployeeService.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	   @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Optional<Employee> getEmployeeById(Long id) {
	        return employeeRepository.findById(id);
	    }

	    @Override
	    public Employee createEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @Override
	    public Optional<Employee> updateEmployee(Long id, Employee employeeDetails) {
	        return employeeRepository.findById(id).map(employee -> {
	            employee.setName(employeeDetails.getName());
	            employee.setEmail(employeeDetails.getEmail());
	            employee.setPosition(employeeDetails.getPosition());
	            return employeeRepository.save(employee);
	        });
	    }

	    @Override
	    public boolean deleteEmployee(Long id) {
	        if (employeeRepository.existsById(id)) {
	            employeeRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

}

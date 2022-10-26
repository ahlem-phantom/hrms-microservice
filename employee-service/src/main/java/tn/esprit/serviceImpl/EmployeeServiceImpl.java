package tn.esprit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Employee;
import tn.esprit.repository.EmployeeRepository;
import tn.esprit.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> findAllEmployee(String filter,int page,int limit) {
		Pageable pageable = PageRequest.of(page, limit);
		return employeeRepository.findAll(filter,pageable);
	}

	public List<Employee> deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee findEmployee(Long id) {
		return employeeRepository.findOneById(id);
	}
}

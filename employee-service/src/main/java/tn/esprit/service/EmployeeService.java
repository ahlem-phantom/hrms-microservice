package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public List<Employee> findAllEmployee(String filter,int page,int limit);

	public List<Employee> deleteEmployee(Long id);

	public Employee findEmployee(Long id);

	public void updateEmployee(Employee employee);
}

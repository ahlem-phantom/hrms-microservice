package tn.esprit.controllers;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.entities.Employee;
import tn.esprit.service.EmployeeService;
import tn.esprit.serviceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl EmployeeService;
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/ajouterEmployee")
	public void ajouterEmployee(@RequestBody Employee employee) {
		EmployeeService.addEmployee(employee);
	}
	@DeleteMapping(value="/deleteEmployee/{id}")
	public void supprimerEmployee(@PathVariable Long id) {
		EmployeeService.deleteEmployee(id);
	}
	@GetMapping("/findEmployees")
	public List<Employee> afficherEmployee(@RequestParam(value ="filter",required = false)String filter,@RequestParam(value="page")int page,@RequestParam(value="limit")int limit) {
		if (StringUtils.isBlank(filter))
			filter="";
		return EmployeeService.findAllEmployee(filter,page,limit);
	}
	@GetMapping("/findEmployeeById/{id}")
	public Employee afficherEmployee(@PathVariable Long id) {
		return EmployeeService.findEmployee(id);
	}
	
	@PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee){
//		Employee employee=new Employee();
//		employee.setId(Employee.getId());
//		employee.setPrenom(Employee.getNom());
//		employee.setDateNaissance(Employee.getDateNaissance());
//		employee.setNom(Employee.getNom());
//		employee.setEmail(Employee.getEmail());
		
		EmployeeService.addEmployee(employee);
	}
}

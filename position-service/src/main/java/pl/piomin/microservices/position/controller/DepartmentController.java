package pl.piomin.microservices.position.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import pl.piomin.microservices.position.model.Department;
import pl.piomin.microservices.position.service.DepartmentService;
import java.util.List;


@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public ResponseEntity<List<Department>> getAllDepartment(){
		return ResponseEntity.ok().body(departmentService.getAllDepartment());
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable long id){
		return ResponseEntity.ok().body(departmentService.getDepartmentById(id));
	}
	
	@PostMapping("/departments")
	public ResponseEntity<Department> createDepartment(@RequestBody Department department){
		return ResponseEntity.ok().body(this.departmentService.createDepartment(department));
	}
	
	@PutMapping("/departments/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable Integer id, @RequestBody Department department){
		department.setId(id);
		return ResponseEntity.ok().body(this.departmentService.updateDepartment(department));
	}

	@DeleteMapping("/departments/{id}")
	public HttpStatus deleteDepartment(@PathVariable Integer id){
		this.departmentService.deleteDepartment(id);
		return HttpStatus.OK;
	}
}

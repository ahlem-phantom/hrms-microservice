package pl.piomin.microservices.position.service;
import java.util.List;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.position.model.Department;

public interface DepartmentService {
	Department createDepartment(Department department);

	Department updateDepartment(Department department) throws CustomerNotFoundException;

	List<Department> getAllDepartments();

	Department getDepartmentById(int id);

	String deleteDepartments(int id);

    
}

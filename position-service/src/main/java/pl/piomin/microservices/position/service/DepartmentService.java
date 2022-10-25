package pl.piomin.microservices.position.service;
import java.util.List;

import pl.piomin.microservices.position.model.Department;

public interface DepartmentService {
	Position createDepartment(Department department);

	Position updateDepartment(Department department);

	List<Department> getAllDepartment();

	Department getDepartmentById(long departmentId);

	void deleteDepartment(long departmentId);
}

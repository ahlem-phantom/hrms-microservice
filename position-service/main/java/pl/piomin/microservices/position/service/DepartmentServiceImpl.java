package pl.piomin.microservices.recruitement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piomin.microservices.position.model.Department;
import pl.piomin.microservices.position.repository.DepartmentRepository;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
	private DepartmentRepository departmentRepository;

    
    @Override
    public Department createDepartment(Department department) {
       return this.departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) throws CustomerNotFoundException {
        Department c = this.departmentRepository.findOne(department.getId());
			this.departmentRepository.save(department);
			return c;  
    }

    @Override
    public List<Department> getAllDepartments() {
       return this.departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(int id) {
        return this.departmentRepository.findOne(id);
    }

    @Override
    public String deleteDepartment(int id) {
        Department  department =this.departmentRepository.findOne(id);
        this.departmentRepository.delete(department);
        return "Department deleted successfully";
        
    }
    
}

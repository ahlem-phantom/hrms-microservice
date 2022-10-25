package pl.piomin.microservices.position.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.piomin.microservices.position.exception.ResourceNotFoundException;
import pl.piomin.microservices.position.model.Position;
import pl.piomin.microservices.position.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@Override
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		Optional<Department> departmentDb = this.departmentRepository.findById(department.getId());
		
		if(departmentDb.isPresent()) {
			Department departmentUpdate = departmentDb.get();
			departmentUpdate.setDepartmentId(department.getDepartmentId());
			departmentUpdate.setDname(department.getDname());
			departmentUpdate.setLoc(department.getLoc());
			departmentUpdate.setStartDate(department.getStartDate());
			departmentUpdate.setEndDate(department.getEndDate());
			departmentUpdate.setEmployeeId(department.getEmployeeId());
			departmentRepository.save(departmentUpdate);
			return departmentUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + department.getId());
		}		
	}

	@Override
	public List<Department> getAllDepartment() {
		return this.departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(long departmentId) {
		
		Optional<Department> departmentDb = this.departmentRepository.findById(departmentId);
		
		if(departmentDb.isPresent()) {
			return departmentDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + departmentId);
		}
	}

	@Override
	public void deleteDepartment(long departmentId) {
		Optional<Department> departmentDb = this.departmentRepository.findById(departmentId);
		
		if(departmentDb.isPresent()) {
			this.departmentRepository.delete(departmentDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + departmentId);
		}
		
	}

}

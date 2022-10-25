package pl.piomin.microservices.position.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.piomin.microservices.position.model.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}

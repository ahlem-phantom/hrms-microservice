package pl.piomin.microservices.recruitement.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.position.model.Department;
import pl.piomin.microservices.position.service.DepartmentServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@Slf4j
public class DepartmentApi {

    @Autowired
	private DepartmentServiceImpl departmentService;


    @RequestMapping(method = RequestMethod.GET, value = "/get-all-departments")
    public List<Department> findAll() {
        log.info("Department.findAll()");
        return departmentService.getAllDepartments();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get-department/{id}")
    public Department findById(@PathVariable("id") Integer id) throws CustomerNotFoundException {
        Department department = departmentService.getDepartmentById(id);
        return department;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-department")
    public Department createNewDepartment(@RequestBody Department department) {
        Department d = departmentService.createDepartment(department);
        return d;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-department/{id}")
    public boolean deleteDepartment(@PathVariable Integer id) {
        log.info("Department.deletePostings()");
        departmentService.deleteDepartment(id);
        return true;
    }

}

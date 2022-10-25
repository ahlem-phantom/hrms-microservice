package pl.piomin.microservices.position.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "departments")
@Table(name = "departments")
public final class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "departmentId", unique = true, nullable = false, precision = 10)
	private Integer departmentId;
	
	@Column(name = "dname", length = 100)
	private String dname;
	
	@Column(name = "loc", length = 100)
	private String loc;
	
	@OneToMany(targetEntity = Employee.class, mappedBy = "department", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Employee> employees;
	
	public Department() {
		
	}
	
	public Department(Integer departmentId, String dname, String loc, Set<Employee> employees) {
		this.departmentId = departmentId;
		this.dname = dname;
		this.loc = loc;
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Employee> getEmployees() {
		return Collections.unmodifiableSet(employees);
	}

	public void setEmployees(final Set<Employee> employees) {
		this.employees = employees;
	}
	
	
		
}



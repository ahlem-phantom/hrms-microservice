package pl.piomin.microservices.position.model;

import java.util.Date;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity 
@Table(name = "positions")
public class Position {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer positionId;

	@Column(name = "designation")
    private String designation;

    
	@Column(name = "departmentName")
    private String departmentName;

	@Column(name = "startDate")
    private Date startDate;

	@Column(name = "endDate")
    private Date endDate;

	@Column(name = "employeeId")
    private Long employeeId;

    public Position() {

    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }


}
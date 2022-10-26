package pl.piomin.microservices.recruitement.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "job-postings")
public class JobPostings {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "minSalary")
	private int minSalary;

	@Column(name = "maxSalary")
	private int maxSalary;

	@Column(name = "applicationStatus")
	private ApplicantStatus applicationStatus;
	
	@Column(name = "jobDescription")
	private String jobDescription;

	@Column(name = "noOfOpenings")
	private String noOfOpenings;

	@Column(name = "contractType")
	private String contractType;

	@Column(name = "contractPeriod")
	private int contractPeriod;

	public JobPostings(int id, int minSalary,int maxSalary, ApplicantStatus status,String jobDescription,String noOfOpenings,String contractType,int contractPeriod) {
        this.id = id;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.applicationStatus = status;
		this.jobDescription = jobDescription;
		this.noOfOpenings = noOfOpenings;
		this.contractType = contractType;
		this.contractPeriod	= contractPeriod;
    }

	
}

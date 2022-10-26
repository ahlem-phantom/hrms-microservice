package pl.piomin.microservices.recruitement.service;
import java.util.List;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.recruitement.model.JobApplicants;

public interface JobApplicantsService {
	JobApplicants createJobApplicants(JobApplicants jobApplicant);

	JobApplicants updateJobApplicants(JobApplicants jobApplicant) throws CustomerNotFoundException;

	List<JobApplicants> getAllJobApplicants();

	JobApplicants getJobApplicantsById(int jobApplicantId);

	String deleteJobApplicants(int id);

    
}

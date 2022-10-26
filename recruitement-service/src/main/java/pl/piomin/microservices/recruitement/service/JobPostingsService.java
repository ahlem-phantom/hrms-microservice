package pl.piomin.microservices.recruitement.service;
import java.util.List;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.recruitement.model.JobPostings;

public interface JobPostingsService {
	JobPostings createJobPostings(JobPostings jobPostings);

	JobPostings updateJobPostings(JobPostings jobPostings) throws CustomerNotFoundException;

	List<JobPostings> getAllJobPostings();

	JobPostings getJobPostingsById(int JobPostingsId);

	String deleteJobPostings(int id);

    
}

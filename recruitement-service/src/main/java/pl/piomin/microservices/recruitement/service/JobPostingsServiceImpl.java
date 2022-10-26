package pl.piomin.microservices.recruitement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piomin.microservices.recruitement.model.JobPostings;
import pl.piomin.microservices.recruitement.repository.JobApplicantsRepository;
import pl.piomin.microservices.recruitement.repository.JobPostingsRepository;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;

@Service
public class JobPostingsServiceImpl implements JobPostingsService{

    @Autowired
	private JobPostingsRepository jobPostingsRepository;

    
    @Override
    public JobPostings createJobPostings(JobPostings jobPostings) {
       return this.jobPostingsRepository.save(jobPostings);
    }

    @Override
    public JobPostings updateJobPostings(JobPostings jobPosting) throws CustomerNotFoundException {
        JobPostings c = this.jobPostingsRepository.findOne(jobPosting.getId());
			this.jobPostingsRepository.save(jobPosting);
			return c;  
    }

    @Override
    public List<JobPostings> getAllJobPostings() {
       return this.jobPostingsRepository.findAll();
    }

    @Override
    public JobPostings getJobPostingsById(int jobPostingId) {
        return this.jobPostingsRepository.findOne(jobPostingId);
    }

    @Override
    public String deleteJobPostings(int jobPostingsId) {
        JobPostings  jobPostings =this.jobPostingsRepository.findOne(jobPostingsId);
        this.jobPostingsRepository.delete(jobPostings);
        return "Job Posting deleted successfully";
        
    }
    
}

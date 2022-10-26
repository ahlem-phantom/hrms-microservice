package pl.piomin.microservices.recruitement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piomin.microservices.recruitement.model.JobApplicants;
import pl.piomin.microservices.recruitement.repository.JobApplicantsRepository;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;

@Service
public class JobApplicantsServiceImpl implements JobApplicantsService{

    @Autowired
	private JobApplicantsRepository jobApplicantsRepository;

    
    @Override
    public JobApplicants createJobApplicants(JobApplicants jobApplicant) {
       return this.jobApplicantsRepository.save(jobApplicant);
    }

    @Override
    public JobApplicants updateJobApplicants(JobApplicants jobApplicant) throws CustomerNotFoundException {
        JobApplicants c = this.jobApplicantsRepository.findOne(jobApplicant.getId());
			this.jobApplicantsRepository.save(jobApplicant);
			return c;  
    }

    @Override
    public List<JobApplicants> getAllJobApplicants() {
       return this.jobApplicantsRepository.findAll();
    }

    @Override
    public JobApplicants getJobApplicantsById(int jobApplicantId) {
        return this.jobApplicantsRepository.findOne(jobApplicantId);
    }

    @Override
    public String deleteJobApplicants(int jobApplicantId) {
        JobApplicants  jobApplicants =this.jobApplicantsRepository.findOne(jobApplicantId);
        this.jobApplicantsRepository.delete(jobApplicants);
        return "Customer deleted successfully";
        
    }
    
}

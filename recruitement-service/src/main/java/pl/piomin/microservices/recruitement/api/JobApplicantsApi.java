package pl.piomin.microservices.recruitement.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.recruitement.model.JobApplicants;
import pl.piomin.microservices.recruitement.service.JobApplicantsService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@Slf4j
public class JobApplicantsApi {

    @Autowired
	private JobApplicantsService jobApplicantsService;


    @RequestMapping(method = RequestMethod.GET, value = "/get-all-job-applicants")
    public List<JobApplicants> findAll() {
        log.info("JobApplicants.findAll()");
        return jobApplicantsService.getAllJobApplicants();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public JobApplicants findById(@PathVariable("id") Integer id) throws CustomerNotFoundException {
        JobApplicants jobApplicants = jobApplicantsService.getJobApplicantsById(id);
        return jobApplicants;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-job-applicant")
    public JobApplicants createNewApplicant(@RequestBody JobApplicants jobApplicants) {
        JobApplicants j = jobApplicantsService.createJobApplicants(jobApplicants);
        return j;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deleteCustomer(@PathVariable Integer id) {
        log.info("JobApplicants.deleteCustomer()");
        jobApplicantsService.deleteJobApplicants(id);
        return true;
    }

}

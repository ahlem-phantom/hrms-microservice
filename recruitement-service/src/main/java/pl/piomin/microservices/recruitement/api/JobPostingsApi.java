package pl.piomin.microservices.recruitement.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.microservices.recruitement.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.recruitement.model.JobPostings;
import pl.piomin.microservices.recruitement.service.JobPostingsServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@Slf4j
public class JobPostingsApi {

    @Autowired
	private JobPostingsServiceImpl jobPostingsService;


    @RequestMapping(method = RequestMethod.GET, value = "/get-all-job-postings")
    public List<JobPostings> findAll() {
        log.info("JobApplicants.findAll()");
        return jobPostingsService.getAllJobPostings();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get-jobposting/{id}")
    public JobPostings findById(@PathVariable("id") Integer id) throws CustomerNotFoundException {
        JobPostings jobApplicants = jobPostingsService.getJobPostingsById(id);
        return jobApplicants;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-job-postings")
    public JobPostings createNewCustomer(@RequestBody JobPostings jobPostings) {
        JobPostings j = jobPostingsService.createJobPostings(jobPostings);
        return j;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-jobposting/{id}")
    public boolean deletePostings(@PathVariable Integer id) {
        log.info("JobPostings.deletePostings()");
        jobPostingsService.deleteJobPostings(id);
        return true;
    }

}

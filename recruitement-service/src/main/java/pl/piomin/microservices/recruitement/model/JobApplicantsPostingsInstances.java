package pl.piomin.microservices.recruitement.model;

public class JobApplicantsPostingsInstances {

    private JobApplicants applicant;

    private JobPostings jobPosting;

    public JobApplicantsPostingsInstances() {

    }

    public JobApplicants getApplicant() {
        return applicant;
    }

    public void setApplicant(JobApplicants applicant) {
        this.applicant = applicant;
    }

    public JobPostings getJobPosting() {
        return jobPosting;
    }

    public void setJobPosting(JobPostings jobPosting) {
        this.jobPosting = jobPosting;
    }
}

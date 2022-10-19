package pl.piomin.microservices.recruitement.model;

public class JobApplicantsPostings {

    private Number applicantId;

    private Number jobPostingId;

    public JobApplicantsPostings() {

    }

    public Number getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Number applicantId) {
        this.applicantId = applicantId;
    }

    public Number getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(Number jobPostingId) {
        this.jobPostingId = jobPostingId;
    }
}

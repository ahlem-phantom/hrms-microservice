package pl.piomin.microservices.recruitement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.piomin.microservices.recruitement.model.JobPostings;

public interface JobPostingsRepository extends JpaRepository<JobPostings, Integer> {

}

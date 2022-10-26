package pl.piomin.microservices.recruitement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.piomin.microservices.recruitement.model.JobApplicants;

public interface JobApplicantsRepository extends JpaRepository<JobApplicants, Integer> {

}

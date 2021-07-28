package company.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer>{
	List<JobExperience> findByJobSeeker_idOrderByEndDateDesc(int jobSeekerId);
}

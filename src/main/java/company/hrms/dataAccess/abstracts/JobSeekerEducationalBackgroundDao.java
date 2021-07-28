package company.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.JobSeekerEducationalBackground;

public interface JobSeekerEducationalBackgroundDao extends JpaRepository<JobSeekerEducationalBackground,Integer>{

	
	List<JobSeekerEducationalBackground> findByJobSeeker_idOrderByGraduateDate(int jobSeekerId);
}

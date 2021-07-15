package company.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job , Integer> {
	List<Job> getByIsActive(boolean isActive);
	
	List<Job> getByIsActiveOrderByCreateDateAsc(boolean isActive);
	
	List<Job> getByIsActiveAndEmployer_EmployerId(boolean isActive , int employer_id);
	
	List<Job> getByEmployer_EmployerId(int employer_id);
	
}

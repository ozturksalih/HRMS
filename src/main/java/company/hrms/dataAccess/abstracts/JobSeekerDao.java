package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.JobSeeker;
public interface JobSeekerDao extends JpaRepository<JobSeeker , Integer>{

}

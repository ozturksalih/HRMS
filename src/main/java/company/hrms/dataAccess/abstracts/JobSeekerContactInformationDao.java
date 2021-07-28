package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.JobSeekerContactInformation;

public interface JobSeekerContactInformationDao  extends JpaRepository<JobSeekerContactInformation,Integer>{

}

package company.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.Employer;

public interface EmployersDao extends JpaRepository<Employer , Integer>{

}

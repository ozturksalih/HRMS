package company.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School , Integer>{

}

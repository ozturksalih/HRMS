package company.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import company.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer> {
	
	
}

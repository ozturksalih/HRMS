package company.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import company.hrms.entities.concretes.KnownLanguage;

public interface KnownLanguageDao extends JpaRepository<KnownLanguage,Integer>{

	List<KnownLanguage> findByJobSeeker_id(int jobSeekerId);
	
}

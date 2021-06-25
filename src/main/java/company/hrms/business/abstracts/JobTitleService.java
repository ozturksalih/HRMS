package company.hrms.business.abstracts;


import java.util.List;

import company.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}

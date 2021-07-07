package company.hrms.business.abstracts;


import java.util.List;

import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobSeeker;
import company.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
	Result add(JobTitle jobTitle);
	Result update(JobTitle jobTitle);
	Result delete(JobTitle jobTitle);
}

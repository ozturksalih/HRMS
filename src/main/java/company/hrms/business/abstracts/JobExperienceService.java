package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	Result add(JobExperience jobExperience);
	DataResult<List<JobExperience>> getAll();
	DataResult<List<JobExperience>> getAllByEndDate(int jobSeekerId);
	Result update(JobExperience jobExperience);
	Result delete(JobExperience jobExperience);

}

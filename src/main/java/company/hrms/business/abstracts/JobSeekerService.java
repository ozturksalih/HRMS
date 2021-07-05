package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.*;
import company.hrms.entities.concretes.JobSeeker;
public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	Result Delete(JobSeeker jobSeeker);
}

package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.Job;

public interface JobService {
	
	DataResult<List<Job>> getAll();
	
	Result add(Job job);
	
	Result update(Job job);
	
	Result delete(Job job);
	
	DataResult<List<Job>> getActiveJobs();
	
	DataResult<List<Job>> getActiveJobsOrderByCreateDateAsc();
	
	DataResult<List<Job>> getActiveJobsByEmployer(int employer_id);
	
	DataResult<List<Job>> getByEmployer_EmployerId(int employer_id);
}


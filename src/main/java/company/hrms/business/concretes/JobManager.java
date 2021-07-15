package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.JobService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.JobDao;
import company.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll());
	}

	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Add Function");
	}

	@Override
	public Result update(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("updated job");
	}

	@Override
	public Result delete(Job job) {
		this.jobDao.delete(job);
		return new SuccessResult("deleted job");
	}

	@Override
	public DataResult<List<Job>> getActiveJobs() {
		return new SuccessDataResult<List<Job>>(this.jobDao.getByIsActive(true));
	}

	@Override
	public DataResult<List<Job>> getActiveJobsOrderByCreateDateAsc() {
		return new SuccessDataResult<List<Job>>(this.jobDao.getByIsActiveOrderByCreateDateAsc(true));
	}

	@Override
	public DataResult<List<Job>> getActiveJobsByEmployer( int employer_id) {
		return new SuccessDataResult<List<Job>>(this.jobDao.getByIsActiveAndEmployer_EmployerId(true, employer_id));
	}

	@Override
	public DataResult<List<Job>> getByEmployer_EmployerId(int employer_id) {
		return new SuccessDataResult<List<Job>>(this.jobDao.getByEmployer_EmployerId(employer_id));
	}

}

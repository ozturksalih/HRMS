package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.JobExperienceService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.JobExperienceDao;
import company.hrms.entities.concretes.JobExperience;
@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		this.jobExperienceDao = jobExperienceDao;
	}
	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll());
	}

	@Override
	public DataResult<List<JobExperience>> getAllByEndDate(int jobSeekerId) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findByJobSeeker_idOrderByEndDateDesc(jobSeekerId));
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(JobExperience jobExperience) {
		this.jobExperienceDao.delete(jobExperience);
		return new SuccessResult("deleted");
	}

}

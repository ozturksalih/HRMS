package company.hrms.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.JobSeekerService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.ErrorResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.JobSeekerDao;
import company.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}
	public boolean isAllFieldFilled(JobSeeker jobSeeker) {
		boolean allFields = Objects.isNull(jobSeeker.getEmail()) ||
							Objects.isNull(jobSeeker.getDate_of_birth().toString()) ||
							Objects.isNull(jobSeeker.getFirst_name()) ||
							Objects.isNull(jobSeeker.getIdentification_no()) ||
							Objects.isNull(jobSeeker.getLast_name()) ||
							Objects.isNull(jobSeeker.getPassword());		
		if(allFields == true) {
			return false;
		}
		return true;
	}
	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"getAllFunction");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(isAllFieldFilled(jobSeeker)) {
			
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Add Function");
		}
		
		return new ErrorResult("Errors");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Update Function");
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("delete Function");
	}

}

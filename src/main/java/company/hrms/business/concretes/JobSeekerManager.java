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
import company.hrms.core.utilities.validations.MernisService;
import company.hrms.dataAccess.abstracts.JobSeekerDao;
import company.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private MernisService mernisService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao , MernisService mernisService) {
		this.jobSeekerDao = jobSeekerDao;
		this.mernisService = mernisService;
	}
	
	
	
	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"getAllFunction");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(checkAllReq(jobSeeker).isSuccess()) {
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Add Function");
		}
		
		return new ErrorResult(checkAllReq(jobSeeker).getMessage());
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
	
	
	
	public Result isAllFieldFilled(JobSeeker jobSeeker) {
		boolean allFields = Objects.isNull(jobSeeker.getEmail()) ||
							Objects.isNull(jobSeeker.getDate_of_birth().toString()) ||
							Objects.isNull(jobSeeker.getFirst_name()) ||
							Objects.isNull(jobSeeker.getIdentificationNo()) ||
							Objects.isNull(jobSeeker.getLast_name()) ||
							Objects.isNull(jobSeeker.getPassword());		
		if(allFields == true) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
	
	
	//not working
	public DataResult<JobSeeker> getByEmail(String email){
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByEmail(email));
	}
	
	public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByIdentificationNoEquals(identityNumber));
	}
	public boolean isValidate(JobSeeker jobSeeker) {
		return this.mernisService.Validate(jobSeeker);
	}
	
	public Result checkAllReq(JobSeeker jobSeeker) {
		
		if(this.jobSeekerDao.findByEmail(jobSeeker.getEmail()) != null) {
			return new ErrorResult("This email address already in the database");
		}
		else if(this.jobSeekerDao.findByIdentificationNoEquals(jobSeeker.getIdentificationNo())!= null) {
			return new ErrorResult("This identity number already in the database");
		}
		else if(!isAllFieldFilled(jobSeeker).isSuccess()) {
			return new ErrorResult("Please Fill all req blanks");
		}
		else if(isValidate(jobSeeker)) {
			return new ErrorResult("Can't Validate ");
		}
		else {
			
			return new SuccessResult();
		}
	}

}

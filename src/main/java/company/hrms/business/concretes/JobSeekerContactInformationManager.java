package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.JobSeekerContactInformationService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.JobSeekerContactInformationDao;
import company.hrms.entities.concretes.JobSeekerContactInformation;

@Service
public class JobSeekerContactInformationManager implements JobSeekerContactInformationService{

	private JobSeekerContactInformationDao jobSeekerContactInformationDao;
	@Autowired
	public JobSeekerContactInformationManager(JobSeekerContactInformationDao jobSeekerContactInformationDao) {
		this.jobSeekerContactInformationDao = jobSeekerContactInformationDao;
	}
	@Override
	public Result add(JobSeekerContactInformation jobSeekerContactInformation) {
		this.jobSeekerContactInformationDao.save(jobSeekerContactInformation);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<JobSeekerContactInformation>> getAll() {
		return new SuccessDataResult<List<JobSeekerContactInformation>>(this.jobSeekerContactInformationDao.findAll());
	}

	@Override
	public Result update(JobSeekerContactInformation jobSeekerContactInformation) {
		this.jobSeekerContactInformationDao.save(jobSeekerContactInformation);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(JobSeekerContactInformation jobSeekerContactInformation) {
		this.jobSeekerContactInformationDao.delete(jobSeekerContactInformation);
		return new SuccessResult("deleted");
	}

}

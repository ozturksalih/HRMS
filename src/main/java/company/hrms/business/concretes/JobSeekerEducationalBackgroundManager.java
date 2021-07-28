package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.JobSeekerEducationalBackgroundService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.JobSeekerEducationalBackgroundDao;
import company.hrms.entities.concretes.JobSeekerEducationalBackground;
@Service
public class JobSeekerEducationalBackgroundManager implements JobSeekerEducationalBackgroundService{

	private JobSeekerEducationalBackgroundDao jobSeekerEducationalBackground;
	
	@Autowired
	public JobSeekerEducationalBackgroundManager(JobSeekerEducationalBackgroundDao jobSeekerEducationalBackground) {
		this.jobSeekerEducationalBackground = jobSeekerEducationalBackground;
	}
	
	@Override
	public Result add(JobSeekerEducationalBackground jobSeekerEducationalBackground) {
		this.jobSeekerEducationalBackground.save(jobSeekerEducationalBackground);
		return new SuccessResult("Background Added");
	}

	@Override
	public DataResult<List<JobSeekerEducationalBackground>> getAll() {
		return new SuccessDataResult<List<JobSeekerEducationalBackground>>(this.jobSeekerEducationalBackground.findAll());
	}

	@Override
	public DataResult<List<JobSeekerEducationalBackground>> findByJobSeeker_jobSeekerIdOrderByGraduateDate(
			int jobSeekerId) {
		return new SuccessDataResult<List<JobSeekerEducationalBackground>>(this.jobSeekerEducationalBackground.findByJobSeeker_idOrderByGraduateDate(jobSeekerId));
	}

}

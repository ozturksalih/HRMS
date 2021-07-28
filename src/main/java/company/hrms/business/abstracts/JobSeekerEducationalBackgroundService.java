package company.hrms.business.abstracts;

import company.hrms.entities.concretes.JobSeekerEducationalBackground;

import java.util.List;

import company.hrms.core.utilities.results.*;

public interface JobSeekerEducationalBackgroundService {
	Result add(JobSeekerEducationalBackground jobSeekerEducationalBackground);
	DataResult<List<JobSeekerEducationalBackground>> getAll();
	DataResult<List<JobSeekerEducationalBackground>> findByJobSeeker_jobSeekerIdOrderByGraduateDate(int jobSeekerId);
}

package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobSeekerContactInformation;

public interface JobSeekerContactInformationService {
	Result add(JobSeekerContactInformation jobSeekerContactInformation);
	DataResult<List<JobSeekerContactInformation>> getAll();
	Result update(JobSeekerContactInformation jobSeekerContactInformation);
	Result delete(JobSeekerContactInformation jobSeekerContactInformation);
}

package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.*;
import company.hrms.entities.concretes.Employer;
public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(Employer employer);
}

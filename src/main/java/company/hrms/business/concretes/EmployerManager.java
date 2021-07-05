package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.EmployerService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.EmployersDao;
import company.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployersDao employerDao;
	
	@Autowired
	public EmployerManager(EmployersDao employerDao) {
		this.employerDao =employerDao;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"getall Function");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		
		return new SuccessResult("Add function");
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		
		return new SuccessResult("update function");
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.delete(employer);
		
		return new SuccessResult("Delete function");
	}

}

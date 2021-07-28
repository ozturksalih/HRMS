package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.SchoolService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.SchoolDao;
import company.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		this.schoolDao = schoolDao;
	}
	
	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll());
	}

	@Override
	public Result update(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Updated");
	}

	@Override
	public Result delete(School school) {
		this.schoolDao.delete(school);
		return new SuccessResult("deleted");
	}

}

package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.SchoolDeparmentService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.SchoolDepartmentDao;
import company.hrms.entities.concretes.SchoolDepartment;
@Service
public class SchoolDeparmentManager implements SchoolDeparmentService {

	private SchoolDepartmentDao schoolDepartmentDao;
	
	@Autowired
	public SchoolDeparmentManager(SchoolDepartmentDao schoolDepartmentDao) {
		this.schoolDepartmentDao = schoolDepartmentDao;
	}
	@Override
	public Result add(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<SchoolDepartment>> getAll() {
		return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll());
	}

	@Override
	public Result update(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.delete(schoolDepartment);
		return new SuccessResult("deleted");
	}

}

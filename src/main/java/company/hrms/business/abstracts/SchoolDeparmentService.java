package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.*;
import company.hrms.entities.concretes.SchoolDepartment;

public interface SchoolDeparmentService {
	Result add(SchoolDepartment schoolDepartment);
	DataResult<List<SchoolDepartment>> getAll();
	Result update (SchoolDepartment schoolDepartment);
	Result delete (SchoolDepartment schoolDepartment);
}

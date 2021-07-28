package company.hrms.business.abstracts;
import java.util.List;

import company.hrms.core.utilities.results.*;
import company.hrms.entities.concretes.School;

public interface SchoolService {
	Result add(School school);
	DataResult<List<School >> getAll();
	Result update(School school);
	Result delete(School school);
 }

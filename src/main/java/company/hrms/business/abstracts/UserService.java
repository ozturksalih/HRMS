package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
	Result update(User user);
	Result delete(User user);
	
	
}

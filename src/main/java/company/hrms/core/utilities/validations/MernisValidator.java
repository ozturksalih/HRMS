package company.hrms.core.utilities.validations;

import org.springframework.stereotype.Service;

import company.hrms.entities.concretes.User;
@Service
public class MernisValidator implements MernisService {

	@Override
	public boolean Validate(User user) {
		return true;
	}

}

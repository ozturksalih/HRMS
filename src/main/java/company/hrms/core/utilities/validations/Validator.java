package company.hrms.core.utilities.validations;

import company.hrms.entities.concretes.User;

public interface Validator {
	boolean Validate(User user);
}

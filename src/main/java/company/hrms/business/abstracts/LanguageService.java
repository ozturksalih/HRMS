package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	DataResult<List<Language>> getAll();
	Result update(Language language);
	Result delete(Language languge);
}

package company.hrms.business.abstracts;

import java.util.List;

import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.KnownLanguage;

public interface KnownLanguageService {
	Result add(KnownLanguage knownLanguage);
	DataResult<List<KnownLanguage>> getAll();
	DataResult<List<KnownLanguage>> getAllByJobSeeker(int jobSeekerId);
	Result update(KnownLanguage knownLanguage);
	Result delete(KnownLanguage knownLanguage);
}

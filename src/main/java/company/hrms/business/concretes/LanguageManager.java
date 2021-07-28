package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.LanguageService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.LanguageDao;
import company.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		this.languageDao = languageDao;
	}
	
	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

	@Override
	public Result update(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(Language language) {
		this.languageDao.delete(language);
		return new SuccessResult("deleted");
	}

}

package company.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.KnownLanguageService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.KnownLanguageDao;
import company.hrms.entities.concretes.KnownLanguage;

@Service
public class KnownLanguageManager implements KnownLanguageService{

	private KnownLanguageDao knownLanguageDao;
	
	@Autowired
	public KnownLanguageManager(KnownLanguageDao knownLanguageDao) {
		this.knownLanguageDao = knownLanguageDao;
	}
	
	@Override
	public Result add(KnownLanguage knownLanguage) {
		this.knownLanguageDao.save(knownLanguage);
		return new SuccessResult("Added");
	}

	@Override
	public DataResult<List<KnownLanguage>> getAll() {
		return new SuccessDataResult<List<KnownLanguage>>(this.knownLanguageDao.findAll());
	}

	@Override
	public Result update(KnownLanguage knownLanguage) {
		this.knownLanguageDao.save(knownLanguage);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(KnownLanguage knownLanguage) {
		this.knownLanguageDao.delete(knownLanguage);
		return new SuccessResult("deleted");
	}

	@Override
	public DataResult<List<KnownLanguage>> getAllByJobSeeker(int jobSeekerId) {
		return new SuccessDataResult<List<KnownLanguage>>(this.knownLanguageDao.findByJobSeeker_id(jobSeekerId));
	}

}

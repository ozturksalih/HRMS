package company.hrms.business.concretes;

import java.util.List;
import java.util.Objects;
import java.util.regex.*;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.hrms.business.abstracts.EmployerService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.ErrorResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.core.utilities.results.SuccessDataResult;
import company.hrms.core.utilities.results.SuccessResult;
import company.hrms.dataAccess.abstracts.EmployerDao;
import company.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao =employerDao;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"getall Function");
	}

	@Override
	public Result add(Employer employer) {
		var result = checkAllReq(employer);
		if(result.isSuccess()) {
			this.employerDao.save(employer);
			
			return new SuccessResult("Add function");
		}
		return new ErrorResult(result.getMessage());
		
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		
		return new SuccessResult("update function");
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.delete(employer);
		
		return new SuccessResult("Delete function");
	}
	
	public Result checkAllReq(Employer employer) {
		
		if(!isAllFieldFilled(employer).isSuccess() ) {
			return new ErrorResult(isAllFieldFilled(employer).getMessage());
		
		}else if (!checkDomainsAreSame(employer.getEmail(), employer.getWebsite()).isSuccess() ) {
			return new ErrorResult(checkDomainsAreSame(employer.getEmail(), employer.getWebsite()).getMessage());
		
		}else if(!validateEmail(employer.getEmail()).isSuccess()) {
			
			return new ErrorResult(validateEmail(employer.getEmail()).getMessage());
		
		}else if(this.employerDao.findByEmail(employer.getEmail()) != null) {
			return new ErrorResult("This email address already in the database");
		}
		return new SuccessResult();
		
	}
	
	public Result isAllFieldFilled(Employer employer) {
		boolean allFields = Objects.isNull(employer.getEmail()) ||
							Objects.isNull(employer.getCompany_name()) ||
							Objects.isNull(employer.getWebsite()) ||
							Objects.isNull(employer.getPhone_number()) ||
							Objects.isNull(employer.isIs_activated()) ||
							Objects.isNull(employer.getPassword());		
		if(allFields == true) {
			return new ErrorResult("Please Fill All blanks");
		}
		return new SuccessResult();
	}
	
	public Result checkDomainsAreSame(String email , String website) {
		String emailDomain = getEmailDomain(email);
		String websiteDomain = getWebsiteDomain(website);
		if(emailDomain.equals(websiteDomain)) {
			return new SuccessResult();
		}return new ErrorResult("Domains are not same!");
	}
	
	public String getEmailDomain(String email) {
		String domain = email .substring(email .indexOf("@") + 1);
		return domain;
	}
	public String getWebsiteDomain(String website) {
		String domain = website.substring(website .indexOf(".") + 1);
		return domain;
	}
	
	public DataResult<Employer> getByEmail(String email){
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
	}
	
	public Result validateEmail(String email) {
		if(email == null || email.isEmpty()) {
			return new ErrorResult();
		}
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		if(pattern.matcher(email).matches()) {
			return new SuccessResult();
		}else {
			return new ErrorResult("It's not an email");
		}
	}
	
	

}

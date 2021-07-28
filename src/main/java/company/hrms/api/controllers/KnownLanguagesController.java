package company.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import company.hrms.business.abstracts.KnownLanguageService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.KnownLanguage;

@RestController
@RequestMapping("/api/knownLanguages")
public class KnownLanguagesController {
	
	private KnownLanguageService knownLanguageService;

	@Autowired
	public KnownLanguagesController(KnownLanguageService knownLanguageService) {
		this.knownLanguageService = knownLanguageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<KnownLanguage>> getAll(){
	
		return this.knownLanguageService.getAll();
	}
	
	@GetMapping("/getAllByJobSeeker")
	public DataResult<List<KnownLanguage>> getAllByJobSeeker(@RequestParam("jobSeekerId") int jobSeekerId){
	
		return this.knownLanguageService.getAllByJobSeeker(jobSeekerId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody KnownLanguage knownLanguage) {
		return this.knownLanguageService.add(knownLanguage);
	}
	@PutMapping("/update")
	public Result update(@RequestBody KnownLanguage knownLanguage) {
		return this.knownLanguageService.update(knownLanguage);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody KnownLanguage knownLanguage) {
		return this.knownLanguageService.delete(knownLanguage);
	}
	
}

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

import company.hrms.business.abstracts.JobExperienceService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperiences")
public class JobExperiencesController {
	
	private JobExperienceService jobExperienceService;
	
	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
	
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getallByEndDate")
	public DataResult<List<JobExperience>> getAllByEndDate(@RequestParam("jobSeekerId")int jobSeekerId){
	
		return this.jobExperienceService.getAllByEndDate(jobSeekerId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}
	@PutMapping("/update")
	public Result update(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.update(jobExperience);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.delete(jobExperience);
	}
}

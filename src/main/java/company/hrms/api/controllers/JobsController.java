package company.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import company.hrms.business.abstracts.JobService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	@GetMapping("/getActiveJobs")
	public DataResult<List<Job>> getActiveJobs(){
		return this.jobService.getActiveJobs();
	}
	
	@GetMapping("/getActiveJobsOrderByCreateDateAsc")
	public DataResult<List<Job>> getActiveJobsOrderByCreateDateAsc(){
		return this.jobService.getActiveJobsOrderByCreateDateAsc();
	}
	
	@GetMapping("/getActiveJobsByEmployer")
	public DataResult<List<Job>> getActiveJobsByEmployer(@RequestParam("employer_id") int employer_id){
		return this.jobService.getActiveJobsByEmployer(employer_id);
	}
	
	@GetMapping("/getByEmployer_EmployerId")
	public DataResult<List<Job>> getByEmployer_EmployerId(@RequestParam("employer_id") int employerId){
		return this.jobService.getByEmployer_EmployerId(employerId);
	}
	
	
}

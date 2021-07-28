package company.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import company.hrms.business.abstracts.JobSeekerEducationalBackgroundService;
import company.hrms.entities.concretes.JobSeekerEducationalBackground;
import company.hrms.core.utilities.results.*;


@RestController
@RequestMapping("/api/JobSeekerEducationalBackground")
public class JobSeekerEducationalBackgroundController {
	private JobSeekerEducationalBackgroundService jobSeekerEducationalBackgroundService;
	
	@Autowired
	public JobSeekerEducationalBackgroundController(JobSeekerEducationalBackgroundService jobSeekerEducationalBackgroundService) {
		this.jobSeekerEducationalBackgroundService = jobSeekerEducationalBackgroundService;
	}
	
	@PostMapping("/add")
	Result add(JobSeekerEducationalBackground jobSeekerEducationalBackground) {
		return this.jobSeekerEducationalBackgroundService.add(jobSeekerEducationalBackground);
	}
	@GetMapping("/getAll")
	DataResult<List<JobSeekerEducationalBackground>> getAll(){
		return this.jobSeekerEducationalBackgroundService.getAll();
	}
	
	@GetMapping("/getAllByOrderByGraduationDate")
	DataResult<List<JobSeekerEducationalBackground>> getAllByJobSeeker_JobSeekerIdOrderBySchoolGraduationDate(int jobSeekerId){
		return this.jobSeekerEducationalBackgroundService.findByJobSeeker_jobSeekerIdOrderByGraduateDate(jobSeekerId);
	}
}

package company.hrms.api.controllers;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import company.hrms.business.abstracts.ImageService;
import company.hrms.business.abstracts.JobSeekerContactInformationService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobSeekerContactInformation;

@RestController
@RequestMapping("/api/jobSeekerContacts")
public class JobSeekerContactInformationsController {
	private JobSeekerContactInformationService jobSeekerContactInformationService;
	private ImageService imageService;
	@Autowired
	public JobSeekerContactInformationsController(JobSeekerContactInformationService jobSeekerContactInformationService,
			ImageService imageService) {
		this.jobSeekerContactInformationService = jobSeekerContactInformationService;
		this.imageService = imageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekerContactInformation>> getAll(){
	
		return this.jobSeekerContactInformationService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerContactInformation jobSeekerContactInformation) {
		return this.jobSeekerContactInformationService.add(jobSeekerContactInformation);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody JobSeekerContactInformation jobSeekerContactInformation) {
		return this.jobSeekerContactInformationService.update(jobSeekerContactInformation);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody JobSeekerContactInformation jobSeekerContactInformation) {
		return this.jobSeekerContactInformationService.delete(jobSeekerContactInformation);
	}
}

package company.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import company.hrms.business.abstracts.SchoolDeparmentService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.SchoolDepartment;

@RestController
@RequestMapping("/api/schoolDepartments")
public class SchoolDepartmentsController {
	private SchoolDeparmentService schoolDepartmentService;
	
	@Autowired
	public SchoolDepartmentsController(SchoolDeparmentService schoolDepartmentService) {
		this.schoolDepartmentService = schoolDepartmentService;
	}
	@GetMapping("/getall")
	public DataResult<List<SchoolDepartment>> getAll(){
	
		return this.schoolDepartmentService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolDepartmentService.add(schoolDepartment);
	}
	@PutMapping("/update")
	public Result update(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolDepartmentService.update(schoolDepartment);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolDepartmentService.delete(schoolDepartment);
	}
}

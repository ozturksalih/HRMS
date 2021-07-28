package company.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="job_seeker_educational_background")
@AllArgsConstructor
@NoArgsConstructor

public class JobSeekerEducationalBackground {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "education_background_id")
	private int id ;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private Date startDate;
	
	@Column(name="graduate_date")
	private Date graduateDate;
	
	@ManyToOne()
	@JoinColumn(name="school_id")
	private School school;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private SchoolDepartment schoolDepartment;
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	
}

package company.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{
	
	@Column(name="id")
	private int id ;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name= "identification_no")
	private String identificationNo;
	
	@Column(name  = "date_of_birth")
	private Date date_of_birth;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<JobSeekerEducationalBackground> jobSeekerEducationalBackground;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobExperience> jobExperience;
	
	@OneToMany(mappedBy="jobSeeker")
	private List<KnownLanguage> knownLanguages;
	
	@OneToOne(mappedBy = "jobSeeker")
	private JobSeekerContactInformation jobSeekerContactInformation;

}

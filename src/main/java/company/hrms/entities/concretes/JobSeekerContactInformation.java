package company.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jobseeker_contact_informations")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})

public class JobSeekerContactInformation {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "contact_information_id")
	private int id;
	
	@Column(name = "linkedin_address")
	private String linkedinAddress;
	
	@Column(name = "github_address")
	private String githubAddress;
	
	@Column(name = "about")
	private String about;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@OneToOne
	@JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
	private JobSeeker jobSeeker;
}

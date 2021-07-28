package company.hrms.entities.concretes;

import java.time.LocalDateTime;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_experiences")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})

public class JobExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "job_experience_id")
	private int jobExperienceId;
	
	@Column(name = "company_name")
	@NotBlank
	@NotNull
	private String companyName;
	
	@Column(name = "position_name")
	@NotBlank
	@NotNull
	private String positionName;
	
	@Column(name = "start_date")
	@NotBlank
	@NotNull
	private LocalDateTime  startDate;
	
	@Column(name ="end_date")
	private LocalDateTime  endDate;
	
	@ManyToOne
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
}

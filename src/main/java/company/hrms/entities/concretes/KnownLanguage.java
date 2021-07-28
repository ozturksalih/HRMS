package company.hrms.entities.concretes;

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
@Table(name="known_languages")
@AllArgsConstructor
@NoArgsConstructor

public class KnownLanguage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "known_language_id")
	private int kLanguageId;
	
	@Column(name = "language_level")
	@NotBlank
	@NotNull
	private int languageLevel;
	
	@ManyToOne()
	@JoinColumn(name = "language_id")
	private Language language;
	
	@ManyToOne()
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
}

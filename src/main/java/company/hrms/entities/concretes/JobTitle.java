package company.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="job_titles")
public class JobTitle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String job_title;
	
	JobTitle(){
		super();
	}

	public JobTitle(int id, String job_title) {
		super();
		this.id = id;
		this.job_title = job_title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	
}

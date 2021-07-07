package company.hrms.entities.concretes;

import java.util.Date;


import javax.persistence.*;


@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Table(name="job_seekers")

public class JobSeeker extends User{
	
	@Column(name="id")
	private int id ;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name= "identification_no")
	private String identification_no;
	
	@Column(name  = "date_of_birth")
	private Date date_of_birth;
	
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(int id, String first_name, String last_name, String identification_no, Date date_of_birth) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.identification_no = identification_no;
		this.date_of_birth = date_of_birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getIdentification_no() {
		return identification_no;
	}

	public void setIdentification_no(String identification_no) {
		this.identification_no = identification_no;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	
	
	

}

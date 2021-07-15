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

@Entity
@Table(name = "jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_position_id")
	private int job_position_id;
	
	@Column(name="city_id")
	private int city_id;

	@Column(name="description")
	private String description;
	
	@Column(name = "min_salary")
	private float min_salary;
	
	@Column(name = "max_salary")
	private float max_salary;
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "expirationDate")
	private Date expirationDate;
	
	@Column(name = "quota")
	private int quota;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="city_id",insertable = false, updatable = false)
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="employer_id",insertable = false, updatable = false)
	private Employer employer;
	
	
	@ManyToOne()
	@JoinColumn(name="job_title_id",insertable = false, updatable = false)
	private JobTitle jobTitle;
	
	
	public Job() {
		super();
	}
	public Job(int id, int job_position_id, int city_id, String description, 
			Date createDate, Date expirationDate, int quota , boolean isActive) {
		super();
		this.id = id;
		this.job_position_id = job_position_id;
		this.city_id = city_id;
		this.description = description;
		this.createDate = new Date();
		this.expirationDate = expirationDate;
		this.quota = quota;
		this.isActive = isActive;
	}
	
	public Job(int id, int job_position_id, int city_id, String description, float min_salary, float max_salary,
			Date createDate, Date expirationDate, int quota, boolean isActive) {
		super();
		this.id = id;
		this.job_position_id = job_position_id;
		this.city_id = city_id;
		this.description = description;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
		this.createDate = new Date();
		this.expirationDate = expirationDate;
		this.quota = quota;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(float min_salary) {
		this.min_salary = min_salary;
	}
	public float getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(float max_salary) {
		this.max_salary = max_salary;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public int getJob_position_id() {
		return job_position_id;
	}

	public void setJob_position_id(int job_position_id) {
		this.job_position_id = job_position_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}

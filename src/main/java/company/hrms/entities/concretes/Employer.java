package company.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@PrimaryKeyJoinColumn(name = "id" , referencedColumnName = "id")
@Table(name="employers")

public class Employer extends User {
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "website")
	private String website;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name = "is_activated")
	private boolean is_activated;

	public Employer() {
		super();
	}
	
	public Employer(int id, String company_name, String website, String phone_number, boolean is_activated) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.website = website;
		this.phone_number = phone_number;
		this.is_activated = is_activated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public boolean isIs_activated() {
		return is_activated;
	}

	public void setIs_activated(boolean is_activated) {
		this.is_activated = is_activated;
	}
	
	
	
}

package company.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@PrimaryKeyJoinColumn(name = "employers_id" , referencedColumnName = "id")
@Table(name="employers")
public class Employer extends User {
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "last_name")
	private String website;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name = "is_activated")
	private boolean is_activated;
	
}

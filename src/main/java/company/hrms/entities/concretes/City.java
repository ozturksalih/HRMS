package company.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobs"})
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private int city_id;
	
	@Column(name = "city_name")
	private String city_name;
	
	@OneToMany(mappedBy = "city")
	private List<Job> jobs;
	
	public City() {
		super();
	}
	public City(int city_id, String city_name) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
	}
	
	public int getId() {
		return city_id;
	}
	public void setId(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
	
}

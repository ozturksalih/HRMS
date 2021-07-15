package company.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	private int city_name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<Job> jobs;
	
	public int getId() {
		return city_id;
	}
	public void setId(int city_id) {
		this.city_id = city_id;
	}
	public int getCity_name() {
		return city_name;
	}
	public void setCity_name(int city_name) {
		this.city_name = city_name;
	}
	public City() {
		super();
	}
	public City(int city_id, int city_name) {
		super();
		this.city_name = city_name;
	}
	
}

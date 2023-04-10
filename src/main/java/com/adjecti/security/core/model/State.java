
package com.adjecti.security.core.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stateid")
	private long id;
	@Column(name ="statename")
	private String name;
	@Column(name ="statecode")
	private String code;
	@ManyToOne
	@JoinColumn(name = "countryid", nullable = false)
	private Country country;
    @OneToMany(mappedBy = "state")
	private List<City> cityList;
	public State(long id, String name, String code, Country country, List<City> cityList) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.country = country;
		this.cityList = cityList;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

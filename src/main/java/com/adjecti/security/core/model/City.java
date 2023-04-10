
package com.adjecti.security.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="cityId")
	private long id;
    @Column(name ="cityName")
	private String name;
    @Column(name = "cityCode")
	private String code;
	@Column(name ="stateid")
    private long stateId;
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
	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
		this.stateId = stateId;
	}
	public City(long id, String name, String code, long stateId) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.stateId = stateId;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

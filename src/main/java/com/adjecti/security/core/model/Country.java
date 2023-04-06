/*
 * package com.adjecti.security.core.model;
 * 
 * import java.util.List;
 * 
 * import jakarta.persistence.Column; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.OneToMany; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "country") public class Country {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name ="countryid") private long id; private String code; private
 * String name;
 * 
 * @OneToMany(mappedBy = "state") private List<State> state; public long getId()
 * { return id; } public void setId(long id) { this.id = id; } public String
 * getCode() { return code; } public void setCode(String code) { this.code =
 * code; } public String getName() { return name; } public void setName(String
 * name) { this.name = name; } public List<State> getState() { return state; }
 * public void setState(List<State> state) { this.state = state; } public
 * Country(long id, String code, String name, List<State> state) { super();
 * this.id = id; this.code = code; this.name = name; this.state = state; }
 * public Country() { super(); // TODO Auto-generated constructor stub }
 * 
 * 
 * }
 */
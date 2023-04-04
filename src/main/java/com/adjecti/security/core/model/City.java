/*
 * package com.adjecti.security.core.model;
 * 
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.ManyToOne; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name ="city_") public class City {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private long cityId;
 * 
 * private String cityName;
 * 
 * private String cityCode;
 * 
 * @ManyToOne private City city;
 * 
 * public long getCityId() { return cityId; }
 * 
 * public void setCityId(long cityId) { this.cityId = cityId; }
 * 
 * public String getCityName() { return cityName; }
 * 
 * public void setCityName(String cityName) { this.cityName = cityName; }
 * 
 * public String getCityCode() { return cityCode; }
 * 
 * public void setCityCode(String cityCode) { this.cityCode = cityCode; }
 * 
 * public City getCity() { return city; }
 * 
 * public void setCity(City city) { this.city = city; }
 * 
 * public City() { super(); // TODO Auto-generated constructor stub }
 * 
 * public City(long cityId, String cityName, String cityCode, City city) {
 * super(); this.cityId = cityId; this.cityName = cityName; this.cityCode =
 * cityCode; this.city = city; }
 * 
 * 
 * 
 * }
 */
package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Mapping Class Emp
 * @author mohta
 *
 */

@Entity
@Table(name = "EMPLOYEE") //O-R mapping 
public class Emp {

	/**
	 * when variable here and column names 
	 * are same there is no need of @annotations
	 */
	/**
	 * Data from Employee class goes to column
	 */
	
	@Id //primary key mapping
	@Column(name = "EMPNO")
	private Integer empId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String city;
	
	@Column(name = "SALARY")
	private Double salary;
	
	public Emp() {
		
	}

	public Emp(Integer empId, String name, String city, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}

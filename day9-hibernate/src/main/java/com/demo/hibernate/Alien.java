package com.demo.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private int aid;
	private String color;
	private String aname;

	public Alien(int aid, String color, String aname) {
		super();
		this.aid = aid;
		this.color = color;
		this.aname = aname;
	}

	public Alien() {
		super();
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
	
	

}

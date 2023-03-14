package com.demo.comparator;

public class Laptop implements Comparable<Laptop> {
	private Integer ram;
	private String brand;
	private String name;

	public Laptop(Integer ram, String brand, String name) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.name = name;
	}

	public Laptop() {
		super();
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Laptop o) {
		if(this.ram>o.ram)
			return 1;
		else if(this.ram<o.ram)
		{
			return -1;
		}else {
			return 0;
			
		}
		
	}
	
	

}

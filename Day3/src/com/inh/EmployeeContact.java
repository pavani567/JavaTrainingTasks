package com.inh;

public class EmployeeContact {
	
	String city;
	String country;
	int pin;
	String designation;
	String dateOfBirth;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public EmployeeContact(String city, String country, int pin, String designation, String dateOfBirth) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
	}
	public void printContact() {
		System.out.println(getDesignation()+" "+getPin()+" "+getDateOfBirth()+" "+getCity()+" "+getCountry());
	}

}


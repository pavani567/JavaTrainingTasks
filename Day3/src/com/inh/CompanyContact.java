//**
/* @author: pavani
 * @companyName is used for name of company
 */
package com.inh;
public class CompanyContact {
	String companyName;
	String website;
	String department;
	String city;
	String country;
	String address;
	int pin;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public CompanyContact(String companyName, String website, String department, String city, String country,
		String address, int pin) {
		super();
		this.companyName = companyName;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
	}
	public void printContact() {
		System.out.println(getWebsite()+" "+getPin()+" "+getDepartment()+" "+getCity());
	}
}

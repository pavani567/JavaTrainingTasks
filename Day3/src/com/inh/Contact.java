package com.inh;

public class Contact {
	
	String contactPerson;
	long mobile;
	String email;
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact(String contactPerson, long mobile, String email) {
		super();
		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;
	}
	public void printContact() {
		System.out.println(getContactPerson()+" "+getEmail()+" "+getMobile());
	}
}







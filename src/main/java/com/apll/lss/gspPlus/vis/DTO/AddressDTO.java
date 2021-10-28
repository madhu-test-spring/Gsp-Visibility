package com.apll.lss.gspPlus.vis.DTO;

public class AddressDTO {
	
	private String firstName;
	private String lastName;
	private String city;
	
	
	public AddressDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AddressDTO(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "AddressDTO [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
	
	

}

package com.apll.lss.gspPlus.vis.DTO;

import java.sql.Date;

public class EmployeeRequestDTO {
	
	private int id;
	private String fname;
	private String lname;
	private String city;
	private String dateCreated;
	
	
	public EmployeeRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeRequestDTO(int id, String fname, String lname, String city, String dateCreated) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.dateCreated = dateCreated;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}


	@Override
	public String toString() {
		return "EmployeeRequestDTO [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	

}

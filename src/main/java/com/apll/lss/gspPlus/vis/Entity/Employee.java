package com.apll.lss.gspPlus.vis.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name="empUpd",
			resultClasses= com.apll.lss.gspPlus.vis.Entity.Employee.class,
			procedureName = "EMP_UPDATE",
			parameters = {
					@StoredProcedureParameter(mode = ParameterMode.IN, name="id", type=Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name="first_name", type=String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name="last_name", type=String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name="city", type=String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name="date_created", type=Date.class)
			})
})
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="first_name")
	private String fname;
	
	@Column(name="last_name")
	private String lname;
	
	@Column(name="city")
	private String city;
	
	@Column(name="date_created")
	private Date dateCreated;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String fname, String lname, String city, Date dateCreated) {
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", dateCreated="
				+ dateCreated + "]";
	}
	
	
	

}

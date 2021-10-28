package com.apll.lss.gspPlus.vis.DTO;

import java.util.List;

public class InputObjVO {
	
	private String name;
	private List<Object> data;
	
	
	public InputObjVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InputObjVO(String name, List<Object> data) {
		super();
		this.name = name;
		this.data = data;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Object> getData() {
		return data;
	}


	public void setData(List<Object> data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "InputObjVO [name=" + name + ", data=" + data + "]";
	}
	
	
	
	

}

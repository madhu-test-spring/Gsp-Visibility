package com.apll.lss.gspPlus.vis.DTO;

import java.util.List;

public class TestDTO {

	private List<Object> inputObj;

	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestDTO(List<Object> inputObj) {
		super();
		this.inputObj = inputObj;
	}

	public List<Object> getInputObj() {
		return inputObj;
	}

	public void setInputObj(List<Object> inputObj) {
		this.inputObj = inputObj;
	}

	@Override
	public String toString() {
		return "TestDTO [inputObj=" + inputObj + "]";
	}

}

package com.apll.lss.gspPlus.vis.DTO;

import org.springframework.stereotype.Component;

@Component
public class QueryScreenAtr {
	
	private String screen_name;
	private String field_name;
	private String field_source;
	
	public QueryScreenAtr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryScreenAtr(String screen_name, String field_name, String field_source) {
		super();
		this.screen_name = screen_name;
		this.field_name = field_name;
		this.field_source = field_source;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public String getField_source() {
		return field_source;
	}

	public void setField_source(String field_source) {
		this.field_source = field_source;
	}
	
	
	
	

}

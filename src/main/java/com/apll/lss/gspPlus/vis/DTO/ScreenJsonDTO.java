package com.apll.lss.gspPlus.vis.DTO;

public class ScreenJsonDTO {
	
	private String section_name;
	private int app_level_skey;
	private int entity_skey;
	private String section_type;
	private String json_file;
	private String base_json;
	
	
	public ScreenJsonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ScreenJsonDTO(String section_name, int app_level_skey, int entity_skey, String section_type,
			String json_file, String base_json) {
		super();
		this.section_name = section_name;
		this.app_level_skey = app_level_skey;
		this.entity_skey = entity_skey;
		this.section_type = section_type;
		this.json_file = json_file;
		this.base_json = base_json;
	}


	public String getSection_name() {
		return section_name;
	}


	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}


	public int getApp_level_skey() {
		return app_level_skey;
	}


	public void setApp_level_skey(int app_level_skey) {
		this.app_level_skey = app_level_skey;
	}


	public int getEntity_skey() {
		return entity_skey;
	}


	public void setEntity_skey(int entity_skey) {
		this.entity_skey = entity_skey;
	}


	public String getSection_type() {
		return section_type;
	}


	public void setSection_type(String section_type) {
		this.section_type = section_type;
	}


	public String getJson_file() {
		return json_file;
	}


	public void setJson_file(String json_file) {
		this.json_file = json_file;
	}


	public String getBase_json() {
		return base_json;
	}


	public void setBase_json(String base_json) {
		this.base_json = base_json;
	}
	
	
}

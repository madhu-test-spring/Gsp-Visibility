package com.apll.lss.gspPlus.vis.DTO;

import org.springframework.stereotype.Component;

@Component
public class QueryFromJoin {

	private String screen_name;
	private String table_names;
	private String table_from_type;
	private String table_attribute_list;
	private String join_condition;
	private String order_by_cond;

	public QueryFromJoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryFromJoin(String screen_name, String table_names, String table_from_type, String table_attribute_list,
			String join_condition, String order_by_cond) {
		super();
		this.screen_name = screen_name;
		this.table_names = table_names;
		this.table_from_type = table_from_type;
		this.table_attribute_list = table_attribute_list;
		this.join_condition = join_condition;
		this.order_by_cond = order_by_cond;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public String getTable_names() {
		return table_names;
	}

	public void setTable_names(String table_names) {
		this.table_names = table_names;
	}

	public String getTable_from_type() {
		return table_from_type;
	}

	public void setTable_from_type(String table_from_type) {
		this.table_from_type = table_from_type;
	}

	public String getTable_attribute_list() {
		return table_attribute_list;
	}

	public void setTable_attribute_list(String table_attribute_list) {
		this.table_attribute_list = table_attribute_list;
	}

	public String getJoin_condition() {
		return join_condition;
	}

	public void setJoin_condition(String join_condition) {
		this.join_condition = join_condition;
	}

	public String getOrder_by_cond() {
		return order_by_cond;
	}

	public void setOrder_by_cond(String order_by_cond) {
		this.order_by_cond = order_by_cond;
	}

}

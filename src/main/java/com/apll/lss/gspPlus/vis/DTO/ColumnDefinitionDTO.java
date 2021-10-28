package com.apll.lss.gspPlus.vis.DTO;

import org.springframework.stereotype.Component;

@Component
public class ColumnDefinitionDTO {

	private boolean pinLeft;
	private String dateFormat;
	private String label;
	private String type;
	private String url;
	private boolean allowFillDown;
	private boolean allowEdit;
	private int width;
	private boolean pinRight;
	private boolean isPayloadColumn;
	private String key;

	public ColumnDefinitionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColumnDefinitionDTO(boolean pinLeft, String dateFormat, String label, String type, String url,
			boolean allowFillDown, boolean allowEdit, int width, boolean pinRight, boolean isPayloadColumn,
			String key) {
		super();
		this.pinLeft = pinLeft;
		this.dateFormat = dateFormat;
		this.label = label;
		this.type = type;
		this.url = url;
		this.allowFillDown = allowFillDown;
		this.allowEdit = allowEdit;
		this.width = width;
		this.pinRight = pinRight;
		this.isPayloadColumn = isPayloadColumn;
		this.key = key;
	}

	public boolean isPinLeft() {
		return pinLeft;
	}

	public void setPinLeft(boolean pinLeft) {
		this.pinLeft = pinLeft;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isAllowFillDown() {
		return allowFillDown;
	}

	public void setAllowFillDown(boolean allowFillDown) {
		this.allowFillDown = allowFillDown;
	}

	public boolean isAllowEdit() {
		return allowEdit;
	}

	public void setAllowEdit(boolean allowEdit) {
		this.allowEdit = allowEdit;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isPinRight() {
		return pinRight;
	}

	public void setPinRight(boolean pinRight) {
		this.pinRight = pinRight;
	}

	public boolean isisPayloadColumn() {
		return isPayloadColumn;
	}

	public void setisPayloadColumn(boolean isPayloadColumn) {
		this.isPayloadColumn = isPayloadColumn;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	
}

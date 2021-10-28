package com.apll.lss.gspPlus.vis.DTO;

public class ColorDTO {
	
	private String favColor;
	private String otherColor;
	
	
	public ColorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ColorDTO(String favColor, String otherColor) {
		super();
		this.favColor = favColor;
		this.otherColor = otherColor;
	}


	public String getFavColor() {
		return favColor;
	}


	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}


	public String getOtherColor() {
		return otherColor;
	}


	public void setOtherColor(String otherColor) {
		this.otherColor = otherColor;
	}


	@Override
	public String toString() {
		return "ColorDTO [favColor=" + favColor + ", otherColor=" + otherColor + "]";
	}
	
	
	
	

}

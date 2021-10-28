package com.apll.lss.gspPlus.vis.DTO;

import org.springframework.stereotype.Component;

@Component
public class GridSettingDTO {
	
	private boolean allowRowSelection;

	public GridSettingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public GridSettingDTO(boolean allowRowSelection) {
		super();
		this.allowRowSelection = allowRowSelection;
	}



	public boolean isAllowRowSelection() {
		return allowRowSelection;
	}

	public void setAllowRowSelection(boolean allowRowSelection) {
		this.allowRowSelection = allowRowSelection;
	}
	
	

}

package com.apll.lss.gspPlus.vis.json;

import java.util.List;
import java.util.Map;

import com.apll.lss.gspPlus.vis.DTO.ColumnDefinitionDTO;
import com.apll.lss.gspPlus.vis.DTO.GridSettingDTO;

public class ResultGridDataResponse {
	
	private GridSettingDTO gridSettings;
	private List<ColumnDefinitionDTO> columnDefinition;
	private List<Map<String,Object>> rowData;
	
	
	public GridSettingDTO getGridSettings() {
		return gridSettings;
	}
	public void setGridSettings(GridSettingDTO gridSettings) {
		this.gridSettings = gridSettings;
	}
	public List<ColumnDefinitionDTO> getColumnDefinition() {
		return columnDefinition;
	}
	public void setColumnDefinition(List<ColumnDefinitionDTO> columnDefinition) {
		this.columnDefinition = columnDefinition;
	}
	public List<Map<String, Object>> getRowData() {
		return rowData;
	}
	public void setRowData(List<Map<String, Object>> rowData) {
		this.rowData = rowData;
	}
	
		
}

package com.apll.lss.gspPlus.vis.Facade;

import org.springframework.stereotype.Component;

import com.apll.lss.gspPlus.vis.DTO.EmployeeRequestDTO;
import com.apll.lss.gspPlus.vis.json.ResultGridDataResponse;

@Component
public interface VisibilityFacade {

	public ResultGridDataResponse getVisSummaryResultData();
	
	public ResultGridDataResponse getScreen();
	
	public void procedureCheck(EmployeeRequestDTO emp);
	

}

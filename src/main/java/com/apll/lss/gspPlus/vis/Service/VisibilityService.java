package com.apll.lss.gspPlus.vis.Service;

import org.springframework.stereotype.Service;

import com.apll.lss.gspPlus.vis.DTO.EmployeeRequestDTO;
import com.apll.lss.gspPlus.vis.json.ResultGridDataResponse;

@Service
public interface VisibilityService {
	
	public ResultGridDataResponse getVisSummaryResultData();
	
	public ResultGridDataResponse getScreen();
	
	public void procedureCheck(EmployeeRequestDTO emp);


}

package com.apll.lss.gspPlus.vis.Facade.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apll.lss.gspPlus.vis.DTO.EmployeeRequestDTO;
import com.apll.lss.gspPlus.vis.Facade.VisibilityFacade;
import com.apll.lss.gspPlus.vis.Service.VisibilityService;
import com.apll.lss.gspPlus.vis.json.ResultGridDataResponse;

@Component
public class VisibilityFacadeImpl implements VisibilityFacade {
	
	@Autowired
	private VisibilityService visibilityService;

	@Override
	public ResultGridDataResponse getVisSummaryResultData() {
		return visibilityService.getVisSummaryResultData();
	}

    @Override
	public ResultGridDataResponse getScreen() {
	
		return visibilityService.getScreen();
	}

	@Override
	public void procedureCheck(EmployeeRequestDTO emp) {
		
	visibilityService.procedureCheck(emp);
		
	}
	


	

	
}

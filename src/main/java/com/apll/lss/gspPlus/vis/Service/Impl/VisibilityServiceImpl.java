package com.apll.lss.gspPlus.vis.Service.Impl;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import com.apll.lss.gspPlus.vis.DTO.ColumnDefinitionDTO;
import com.apll.lss.gspPlus.vis.DTO.EmployeeRequestDTO;
import com.apll.lss.gspPlus.vis.DTO.QueryFromJoin;
import com.apll.lss.gspPlus.vis.DTO.QueryScreenAtr;
import com.apll.lss.gspPlus.vis.DTO.ScreenJsonDTO;
import com.apll.lss.gspPlus.vis.Entity.Employee;
import com.apll.lss.gspPlus.vis.Repository.EmployeeRepository;
import com.apll.lss.gspPlus.vis.Repository.ScreenJsonRepository;
import com.apll.lss.gspPlus.vis.Service.VisibilityService;
import com.apll.lss.gspPlus.vis.dao.VisibilityDao;
import com.apll.lss.gspPlus.vis.json.ResultGridDataResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class VisibilityServiceImpl implements VisibilityService {

	@Autowired
	private ScreenJsonRepository screenJsonRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private VisibilityDao visibilityDao;

	@Override
	public ResultGridDataResponse getVisSummaryResultData() {
	     List<ScreenJsonDTO> screenJsonDTO = screenJsonRepository.getSpecificScreenJson();
	     ScreenJsonDTO specificScreenJson=null;
	    List<QueryScreenAtr> allQueryScreenAtrs = screenJsonRepository.getQueryScreenAtr();
	    List<QueryFromJoin> allQueryFromJoins = screenJsonRepository.getQueryFromJoin();  
	     
	     
	     for(ScreenJsonDTO data:screenJsonDTO) 
			{
				System.out.println(data.getSection_name()+" "+data.getApp_level_skey()+" "+data.getEntity_skey()+" "+data.getJson_file());
			}
			
	    
	     if(screenJsonDTO.size()==1){
	    	   specificScreenJson =   screenJsonDTO.get(0);
	     }
	     
	     ResultGridDataResponse resultGridDataResponse=null;
	     try {
	            resultGridDataResponse = new ObjectMapper().readValue(specificScreenJson.getJson_file()
	    		                                        ,ResultGridDataResponse.class);
	     }catch(JsonProcessingException e){
	    	 e.printStackTrace();
	     }
	     
	     List<ColumnDefinitionDTO> columnDefinitionDTOs = resultGridDataResponse.getColumnDefinition();
	     List<QueryScreenAtr> tempQueryScreenAtr = null;
	     
	     String selectClause=null;
	     
	     List<String> selectedColumns = new ArrayList<>();

	     
	     for(int i=0;i<columnDefinitionDTOs.size();i++) {
	    	 ColumnDefinitionDTO columnDefinitionDTO =  resultGridDataResponse.getColumnDefinition().get(i);
	    	 String tempSpecificScreen = specificScreenJson.getSection_name();
	    	 tempQueryScreenAtr = allQueryScreenAtrs.stream()
	    			.filter(data->data.getField_name().equals(columnDefinitionDTO.getKey()) 
	    			 && data.getScreen_name().equals(tempSpecificScreen))
	    	         .collect(Collectors.toList()); 
	    	 
	    	if(tempQueryScreenAtr != null && tempQueryScreenAtr.size()>0){
		    	 if(selectClause==null) {
		    		 selectClause ="SELECT "+tempQueryScreenAtr.get(0).getField_source()+" "+columnDefinitionDTO.getKey();
		    	 }
		    	 else {
		    		 selectClause=selectClause+","+tempQueryScreenAtr.get(0).getField_source()+" "+columnDefinitionDTO.getKey();
		    	 }
		    	 
		     }  
	    	
	    	selectedColumns.add(columnDefinitionDTO.getKey());
	     }
	     
	    
	     String tempSpecificScreen = specificScreenJson.getSection_name();
	     List<QueryFromJoin> queryFromJoins=allQueryFromJoins.stream()
		    	 .filter(data-> data.getScreen_name().equals(tempSpecificScreen))
		    	 .collect(Collectors.toList());
	     
	     QueryFromJoin tempQueryFromJoin = null;
	     
	     String fromClause=null;
	     String whereClause=null;
	     String orderBy = null;
	     

	     
		 for(int j=0;j<queryFromJoins.size();j++){
		    tempQueryFromJoin =	queryFromJoins.get(j);
		    	
			    	if(tempQueryFromJoin.getTable_from_type().equals("STATIC")) {
			    		if(fromClause==null) {
			    			fromClause ="FROM "+tempQueryFromJoin.getTable_names();
					    	 try { if(!tempQueryFromJoin.getJoin_condition().equals(null)) {
						    	  whereClause ="WHERE "+tempQueryFromJoin.getJoin_condition();
					    	     }
					    	 }catch(NullPointerException e)
					    	 {
					    		 System.out.println("no join condition present");
					    	 }
					    	  orderBy ="ORDER BY "+tempQueryFromJoin.getOrder_by_cond();	
			    		}
			    		else {
			    			fromClause =fromClause+","+tempQueryFromJoin.getTable_names();
			    			try { if(!tempQueryFromJoin.getJoin_condition().equals(null)) {
						    	  whereClause ="WHERE "+tempQueryFromJoin.getJoin_condition();
					    	     }
					    	 }catch(NullPointerException e)
					    	 {
					    		 System.out.println("no join condition present");
					    	 }
					    	  orderBy =orderBy+","+tempQueryFromJoin.getOrder_by_cond();
			    			
			    		}
			    	  
			    	}
			    	else {
			    		if(selectedColumns.contains(tempQueryFromJoin.getTable_attribute_list())) {
			    			if(fromClause==null) {
				    			fromClause ="FROM "+tempQueryFromJoin.getTable_names();
						    	  if(!tempQueryFromJoin.getJoin_condition().equals(null)) {
							    	  whereClause ="WHERE "+tempQueryFromJoin.getJoin_condition();
						    	  }
						    	  orderBy ="ORDER BY "+tempQueryFromJoin.getOrder_by_cond();	
				    		}
				    		else {
				    			fromClause =fromClause+","+tempQueryFromJoin.getTable_names();
						    	  if(!tempQueryFromJoin.getJoin_condition().equals(null)) {
							    	  whereClause =whereClause+","+tempQueryFromJoin.getJoin_condition();
						    	  }
						    	  orderBy =orderBy+","+tempQueryFromJoin.getOrder_by_cond();
				    			
				    		}
			    		}
			    		
			    	}
		    	
	     }
	     
	     System.out.println(selectClause);
	     System.out.println(fromClause);
	     System.out.println(whereClause);
	     System.out.println(orderBy);
	     
	     String finalQuery=selectClause+" "+fromClause+" "+" "+whereClause+" "+orderBy;
	     
	     System.out.println(finalQuery);
	     
	     MapSqlParameterSource parameters = new MapSqlParameterSource();
	     parameters.addValue("bookingSeq",102);
	     List<Map<String,Object>> datalist = visibilityDao.searchVisResultPage(finalQuery,parameters);
	     
	     for(Map<String,Object> data:datalist) {
				data.forEach((k,v)->System.out.println("key :"+ k +" value : "+v));
			}
	     
	     resultGridDataResponse.setRowData(datalist);
	     
	     
	     return resultGridDataResponse;
		                   
		
		
		
	}

	@Override
	public ResultGridDataResponse getScreen() {
		List<ScreenJsonDTO> screenJsonDTO = screenJsonRepository.myMessage();

		ScreenJsonDTO specificScreenJson = null;

		if (screenJsonDTO.size() == 1) {
			specificScreenJson = screenJsonDTO.get(0);
		}

		ResultGridDataResponse resultGridDataResponse = null;
		try {
			resultGridDataResponse = new ObjectMapper().readValue(specificScreenJson.getJson_file(),
					ResultGridDataResponse.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return resultGridDataResponse;

	}

	@Override
	public void procedureCheck(EmployeeRequestDTO emp) {
		
		String data = emp.getDateCreated();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date=null;
		
		try {
			date=sdf.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Map<String,Object> result=
		employeeRepository.empUpdate(emp.getId(),emp.getFname(),emp.getLname(),emp.getCity(),new Date(date.getTime()));
		
		
		
	}

}

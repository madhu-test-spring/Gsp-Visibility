/*package com.apll.lss.gspPlus.vis.helper;

import java.util.List;
import java.util.stream.Collectors;

import com.apll.lss.gspPlus.vis.json.CacheScreenJsonVo;

public class VisibilityHelper {
	
	public Object loadIntegratedSearch(String sectionName,int userSeq,int custSeq)
	{
		List<CacheScreenJsonVo> alljsons = cacheService.getCacheScreenJspns("all");
		
		List<CacheScreenJsonVo> filteredjsons = alljsons.stream().filter(json -> json.getSectionName().equalsIgnoreCase(sectionName)
				                         && N.equalsIgnoreCase(json.getbaseJson()))
		                                 .collect(Collectors.toList());
		
		List<CacheScreenJsonVo> filteredConditionedJsons = null;
		
		if(filteredjsons.size()>1)
		{
			filteredConditionedJsons =filteredjsons.stream().filter(json -> json.getEntitySkey()==userSeq).collect(Collectors.toList());     
			
			if(filteredConditionedJsons.size()==0)
			{
				filteredConditionedJsons = filteredjsons.stream().filter(json -> json.getEntitySkey()==custSeq).collect(Collectors.toList());     	
			}
		}
		
		String json=null;
		CacheScreenJsonVo specificjson = null;
		
		if(filteredConditionedJsons.size()!= 0)
		{
			specificjson = filteredConditionedJsons.stream().get(0);
			json = specificjson.getJsonFile(); 
			
			//json = filteredConditionedJsons.stream().get(0).getJsonFile();
		}else {
			specificjson = filteredjsons.stream().filter(json -> json.getEntitySkey()==0).collect(Collectors.toList());
			json = specificjson.getJsonFile(); 
		}
		
		LoadIntegratedSearchObj loadIntegratedSearchObj = null;
		
		loadIntegratedSearchObj = new MapperObject().readValue(json,LoadIntegratedSearchObj.class);
		
		
		return loadIntegratedSearchObj;
	}

}
*/

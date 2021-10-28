package com.apll.lss.gspPlus.vis.dao.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.apll.lss.gspPlus.vis.dao.VisibilityDao;

@Component
public class VisibilityDaoImpl implements VisibilityDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Map<String, Object>> searchVisResultPage(String query, MapSqlParameterSource parameters) {
		//query = "SELECT * FROM (" + query + ") WHERE ROWNUM<=10";
		System.out.println(query);
		System.out.println("the parameter is : "+parameters);
		List<Map<String,Object>> listOfValues = namedParameterJdbcTemplate.queryForList(query, parameters);
		System.out.println(listOfValues);
		
		for(Map<String,Object> data:listOfValues) {
			data.forEach((k,v)->System.out.println("key :"+ k +" value : "+v));
		}
		
		return listOfValues;
	}
	

}

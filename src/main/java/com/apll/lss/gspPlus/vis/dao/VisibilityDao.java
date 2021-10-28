package com.apll.lss.gspPlus.vis.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public interface VisibilityDao {
	
	public List<Map<String,Object>> searchVisResultPage(String query,MapSqlParameterSource parameters);

}

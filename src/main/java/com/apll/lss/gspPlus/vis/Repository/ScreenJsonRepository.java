package com.apll.lss.gspPlus.vis.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apll.lss.gspPlus.vis.DTO.QueryFromJoin;
import com.apll.lss.gspPlus.vis.DTO.QueryScreenAtr;
import com.apll.lss.gspPlus.vis.DTO.ScreenJsonDTO;
import com.apll.lss.gspPlus.vis.Entity.ScreenJsonEntity;

@Repository
public interface ScreenJsonRepository extends CrudRepository<ScreenJsonEntity,Integer> {
	
	@Query(name="getSpecificJson",nativeQuery=true)
	List<ScreenJsonDTO> getSpecificScreenJson();
	
	@Query(value="SELECT * FROM SCREEN_JSON",nativeQuery = true)
	List<ScreenJsonDTO> myMessage();
	
	@Query(name="getQryScreenAtr",nativeQuery = true)
	List<QueryScreenAtr> getQueryScreenAtr();
	
	@Query(name="getQryFromJoin",nativeQuery = true)
	List<QueryFromJoin> getQueryFromJoin();
	
	
	

}

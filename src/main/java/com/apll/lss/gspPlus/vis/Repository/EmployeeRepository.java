package com.apll.lss.gspPlus.vis.Repository;

import java.sql.Date;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.apll.lss.gspPlus.vis.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	@Procedure(name="empUpd")
	Map<String,Object> empUpdate(@Param("id") int id,
			@Param("first_name") String first_name,
			@Param("last_name") String last_name,
			@Param("city") String city,
			@Param("date_created") Date date_created		
			);
}

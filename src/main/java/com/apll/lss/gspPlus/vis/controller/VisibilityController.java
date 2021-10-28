package com.apll.lss.gspPlus.vis.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apll.lss.gspPlus.vis.DTO.AddrColFood;
import com.apll.lss.gspPlus.vis.DTO.AddressDTO;
import com.apll.lss.gspPlus.vis.DTO.ColorDTO;
import com.apll.lss.gspPlus.vis.DTO.EmployeeRequestDTO;
import com.apll.lss.gspPlus.vis.DTO.FoodDTO;
import com.apll.lss.gspPlus.vis.DTO.InputObjVO;
import com.apll.lss.gspPlus.vis.DTO.TestDTO;
import com.apll.lss.gspPlus.vis.Facade.VisibilityFacade;
import com.apll.lss.gspPlus.vis.json.ResultGridDataResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class VisibilityController {
	
	@Autowired
	private VisibilityFacade visibilityFacade;
	
	@GetMapping("/text")
	public ResultGridDataResponse getVisSummaryResultData(){
		  return visibilityFacade.getVisSummaryResultData();
	}
	
	@GetMapping("/getMessage")
	public String message()
	{
		return "working fine";
	}
	
	@GetMapping("/hello")
	public ResultGridDataResponse getScreen()
	{
		return visibilityFacade.getScreen();
	}
	
	@PostMapping("/data")
	public String procedureCheck(@RequestBody EmployeeRequestDTO emp)
	{
		visibilityFacade.procedureCheck(emp);
		return "data updated successfuly";
	}
	
	@PostMapping("/test")
	public String testData(@RequestBody TestDTO test)
	{
		//System.out.println(test.getInputObj());
		ObjectMapper mapObj = new ObjectMapper();
		
		mapObj.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapObj.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		
		AddrColFood addrColFood = new AddrColFood();
		
		List<AddressDTO> address = new ArrayList<>();
		List<ColorDTO> color = new ArrayList<>();
		List<FoodDTO>  food = new ArrayList<>();
		

		
		test.getInputObj().forEach(value->{
			
			LinkedHashMap obj = (LinkedHashMap)value;
			
			 InputObjVO inputObj = mapObj.convertValue(obj, InputObjVO.class);
			 String name = inputObj.getName();
			 
			 if(name.equalsIgnoreCase("address")) {
				 inputObj.getData().forEach(addData->{
					 AddressDTO addressDTO= mapObj.convertValue(addData,AddressDTO.class);
					 address.add(addressDTO);
					 addrColFood.setAddressList(address);
				 });
			 }
			 
			 if(name.equalsIgnoreCase("color")) {
				 inputObj.getData().forEach(colorData->{
					 ColorDTO colorDTO= mapObj.convertValue(colorData,ColorDTO.class);
					 color.add(colorDTO);
					 addrColFood.setColorList(color);
				 });
			 }
			 
			 if(name.equalsIgnoreCase("food")) {
				 inputObj.getData().forEach(foodData->{
					FoodDTO foodDTO= mapObj.convertValue(foodData,FoodDTO.class);
					food.add(foodDTO);
					addrColFood.setFoodList(food);
				 });
			 }
			 		
			
		}
		);
		
		System.out.println(addrColFood.getAddressList());
		System.out.println(addrColFood.getColorList());
		System.out.println(addrColFood.getFoodList());
		
		
		return "data updated successfuly";
	}
	
	
	@PostMapping("/checkreturn")
	public void testMethodForReturn(@RequestBody String name)
	{
		
		System.out.println("befor return..........");
		System.out.println("befor return..........");
		System.out.println("befor return..........");
		
		if(name.length()>4)
		{
			System.out.println("inside a if condition..........");
			return;
		}
		
		System.out.println("after return..........");
		System.out.println("after return..........");
		System.out.println("after return..........");
	}
	

	

}

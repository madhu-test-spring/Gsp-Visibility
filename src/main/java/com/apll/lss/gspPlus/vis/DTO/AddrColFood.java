package com.apll.lss.gspPlus.vis.DTO;

import java.util.List;

public class AddrColFood {
	
	private List<AddressDTO> addressList;
	
	private List<ColorDTO>   colorList;
	
	private List<FoodDTO>  foodList;

	public AddrColFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddrColFood(List<AddressDTO> addressList, List<ColorDTO> colorList, List<FoodDTO> foodList) {
		super();
		this.addressList = addressList;
		this.colorList = colorList;
		this.foodList = foodList;
	}

	public List<AddressDTO> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressDTO> addressList) {
		this.addressList = addressList;
	}

	public List<ColorDTO> getColorList() {
		return colorList;
	}

	public void setColorList(List<ColorDTO> colorList) {
		this.colorList = colorList;
	}

	public List<FoodDTO> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<FoodDTO> foodList) {
		this.foodList = foodList;
	}

	@Override
	public String toString() {
		return "AddrColFood [addressList=" + addressList + ", colorList=" + colorList + ", foodList=" + foodList + "]";
	}
	
	
	

}

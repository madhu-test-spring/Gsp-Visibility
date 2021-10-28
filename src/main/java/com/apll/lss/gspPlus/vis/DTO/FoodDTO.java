package com.apll.lss.gspPlus.vis.DTO;

public class FoodDTO {
	
	private String firstFood;
	
	private String secFood;
	
	private String thirdFood;

	public FoodDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodDTO(String firstFood, String secFood, String thirdFood) {
		super();
		this.firstFood = firstFood;
		this.secFood = secFood;
		this.thirdFood = thirdFood;
	}

	public String getFirstFood() {
		return firstFood;
	}

	public void setFirstFood(String firstFood) {
		this.firstFood = firstFood;
	}

	public String getSecFood() {
		return secFood;
	}

	public void setSecFood(String secFood) {
		this.secFood = secFood;
	}

	public String getThirdFood() {
		return thirdFood;
	}

	public void setThirdFood(String thirdFood) {
		this.thirdFood = thirdFood;
	}

	@Override
	public String toString() {
		return "FoodDTO [firstFood=" + firstFood + ", secFood=" + secFood + ", thirdFood=" + thirdFood + "]";
	}
	
	

}

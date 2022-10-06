package com.sta.bean;

public class FlipKart {

	private Courier courier;
	
	
	public void setCourier(Courier courier)
	{
		this.courier=courier;
	}
	public FlipKart() {
		
		
	}
	
	
	
	public FlipKart(Courier courier) {
	
		this.courier = courier;
	}
	
	
	public void show()
	{
		System.out.println(courier.deliver());
		
	}
	
}

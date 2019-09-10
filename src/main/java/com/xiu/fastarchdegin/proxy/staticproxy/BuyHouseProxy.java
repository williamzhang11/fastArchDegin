package com.xiu.fastarchdegin.proxy.staticproxy;

public class BuyHouseProxy implements BuyHouse{

	private BuyHouse buyHouse;
	
	public BuyHouseProxy(BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}

	public void buyHosue() {
		 System.out.println("买房前准备");
		 buyHouse.buyHosue();
		 System.out.println("买房后装修");
	}
	
}

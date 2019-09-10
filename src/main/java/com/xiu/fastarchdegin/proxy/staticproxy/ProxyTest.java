package com.xiu.fastarchdegin.proxy.staticproxy;

//静态代理
public class ProxyTest {

	public static void main(String[] args) {
		
		BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHosue();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
	}
}

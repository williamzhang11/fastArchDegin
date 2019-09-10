package com.xiu.fastarchdegin.proxy.cglibprox;

import com.xiu.fastarchdegin.proxy.staticproxy.BuyHouse;
import com.xiu.fastarchdegin.proxy.staticproxy.BuyHouseImpl;
//其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑
public class CglibProxyTest {

	
	public static void main(String[] args){
		
		BuyHouseImpl buyHouse = new BuyHouseImpl();
		CglibProxy11 cglibProxy = new CglibProxy11();
		BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
		buyHouseCglibProxy.buyHosue();
		
	}
}

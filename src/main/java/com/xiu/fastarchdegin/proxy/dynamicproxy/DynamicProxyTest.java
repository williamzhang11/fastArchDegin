package com.xiu.fastarchdegin.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import com.xiu.fastarchdegin.proxy.staticproxy.BuyHouse;
import com.xiu.fastarchdegin.proxy.staticproxy.BuyHouseImpl;
/**
 * 注意Proxy.newProxyInstance()方法接受三个参数：
ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
 *
 */
public class DynamicProxyTest {

	public static void main(String[] args) {
		
		BuyHouse buyHouse = new BuyHouseImpl();
		
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
				Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		
		proxyBuyHouse.buyHosue();
		
	}
}

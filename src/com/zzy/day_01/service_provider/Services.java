package com.zzy.day_01.service_provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务工具类 相当于Collections
 * 
 * @author zhaizhiyang
 *
 */
public class Services {
	//隐藏构造
	private Services() { }
	//声明一个消费端的阻塞Map
	private static final Map<String , Provider> providers = new ConcurrentHashMap<String, Provider>();
	//默认一个消费者的名字
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	//一个注册不带名称的消费者，调用有名称的
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	//一个注册带名称的消费者
	public static void registerProvider(String name, Provider p){
		providers.put(name, p);
	}
	//获取服务的的实例
	public static Service newInstance(){
		//直接还是调用默认名称的获取实例方法
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	//从缓存中去取，如果没有直接抛出异常
	private static Service newInstance(String name) {
		Provider p = providers.get(name);
		if(p == null) {
			throw new IllegalArgumentException("No provider registered with name :" + name);
		}
		return p.newService();
	}
	
}

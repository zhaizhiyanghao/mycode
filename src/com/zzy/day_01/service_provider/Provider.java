package com.zzy.day_01.service_provider;

/**
 * 一个模拟的消费方
 * 
 * @author zhaizhiyang
 *
 */
public interface Provider {
	/**
	 * 消费方需要一个服务的时候，手动创建一个服务
	 * @return
	 */
	public Service newService();
}

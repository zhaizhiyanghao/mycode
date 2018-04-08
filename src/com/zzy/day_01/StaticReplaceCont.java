package com.zzy.day_01;

/**
 * 使用静态方法来获取对象，代替构造方法获取对象 ，使用单例
 * 
 * @author zhaizhiyang
 *
 */
public class StaticReplaceCont {
	private static StaticReplaceCont single;
	
	public static StaticReplaceCont getObject(){
		if(single == null){
			single = new StaticReplaceCont();
		}
		return single ;
	}
	
	public static void main(String[] args) {
	}
}

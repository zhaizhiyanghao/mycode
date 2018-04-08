package com.zzy.day_01.builder;
/**
 * 自己的builder
 * @author zhaizhiyang
 *
 */
public class Demo {
	private final int firstAttr; 
	private final int secondAttr; 
	private final int ThridAttr; 
	
	public static class Builder{
		
		private final int firstAttr; 
		private int secondAttr; 
		private int thridAttr; 
		
		public Builder(int firstAttr){
			this.firstAttr = firstAttr;
		}
		
		public Builder secondAttr(int val){
			secondAttr = val;
			return this;
		}
		
		public Builder thridAttr(int val){
			thridAttr = val;
			return this;
		}
		
		public Demo bulid(){
			return new Demo(this);
		}
	}
	public Demo(Builder builder) {
		this.firstAttr = builder.firstAttr;
		this.secondAttr = builder.secondAttr;
		this.ThridAttr = builder.thridAttr;
	}
	public static void main(String[] args) {
		Demo d = new Demo.Builder(1).secondAttr(2).bulid();
	}
}

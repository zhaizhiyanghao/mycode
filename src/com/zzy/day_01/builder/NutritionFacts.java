package com.zzy.day_01.builder;

/**
 * 使用Builder创建含有多个参数构造方法的对象
 * 
 * @author zhaizhiyang
 *
 */
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
    /**
     * 用于创建实例对象的Builder
     * @author zhaizhiyang
     *
     */
	public static class Builder{
		private final int servingSize;
		private final int servings;
		private int calories = 0;
		private int fat  = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		/**
		 * Builder默认构造函数，必要参数只有两个
		 * @param servingSize
		 * @param servings
		 */
		public Builder(int servingSize , int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		/**
		 * 分别为Builder设置值
		 * @param val
		 * @return
		 */
		public Builder calories(int val){
			calories = val;
			return this;
		}
		/**
		 * 分别为Builder设置值
		 * @param val
		 * @return
		 */
		public Builder fat(int val){
			fat = val;
			return this;
		}
		/**
		 * 分别为Builder设置值
		 * @param val
		 * @return
		 */
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		/**
		 * 分别为Builder设置值
		 * @param val
		 * @return
		 */
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		/**
		 * 利用builder构建NutritionFacts的实例对象
		 * @return
		 */
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	public static void main(String[] args) {
		NutritionFacts nut = new NutritionFacts.Builder(210, 8).build();
		System.out.println(nut.servingSize);
	}
}

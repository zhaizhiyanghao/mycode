package com.zzy.day_01.singleton;

/**
 * 第二种方式,私有化属性，向外提供方法返回实例
 */
public class Elvis_2 {
    private static final Elvis_2 INSTANCE = new Elvis_2();

    public static Elvis_2 getInstance(){
        return INSTANCE;
    }
}

package com.zzy.day_01.singleton;

/**
 * 第一种单例,私有化构造方法，反射可以影响不安全
 */
public class Elvis_1 {
    public final static Elvis_1 elvis = new Elvis_1();

    private Elvis_1() {
    }

}

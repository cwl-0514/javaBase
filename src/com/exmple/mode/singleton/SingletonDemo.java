package com.exmple.mode.singleton;

/**
 * @Author: Administrator
 * @Date: 15:46 2017/9/29
 * @Description: 饿汉试,线程安全,单效率比较低
 */
public class SingletonDemo {
    /* 私有构造方法，防止被实例化 */
    private SingletonDemo(){}

    private static final SingletonDemo instance =new SingletonDemo();

    public static SingletonDemo getInstance(){
        return instance;
    }

}

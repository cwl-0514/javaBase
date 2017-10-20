package com.exmple.mode.singleton;

/**
 * @Author: Administrator
 * @Date: 10:11 2017/10/9
 * @Description:线程安全  并且效率高
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    private SingletonDemo3(){}

    public static SingletonDemo3 getInstance(){
        if (instance == null){
            synchronized (SingletonDemo3.class){
                if(instance == null){
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}

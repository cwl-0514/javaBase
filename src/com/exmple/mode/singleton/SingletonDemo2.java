package com.exmple.mode.singleton;

/**
 * @Author: Administrator
 * @Date: 15:52 2017/9/29
 * @Description:饱汉式,非线程安全
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    /* 私有构造方法，防止被实例化 */
    public SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}

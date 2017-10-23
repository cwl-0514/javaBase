package com.exmple.mode.singleton;

/**
 * @Author: Administrator
 * @Date: 15:52 2017/9/29
 * @Description:����ʽ,���̰߳�ȫ
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    /* ˽�й��췽������ֹ��ʵ���� */
    public SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}

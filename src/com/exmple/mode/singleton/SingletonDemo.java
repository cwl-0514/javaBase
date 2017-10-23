package com.exmple.mode.singleton;

/**
 * @Author: Administrator
 * @Date: 15:46 2017/9/29
 * @Description: ������,�̰߳�ȫ,��Ч�ʱȽϵ�
 */
public class SingletonDemo {
    /* ˽�й��췽������ֹ��ʵ���� */
    private SingletonDemo(){}

    private static final SingletonDemo instance =new SingletonDemo();

    public static SingletonDemo getInstance(){
        return instance;
    }

}

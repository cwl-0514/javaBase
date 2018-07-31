package com.exmple.service;

/**
 * @Author: Administrator
 * @Date: 15:00 2017/10/11
 * @Description:
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
        System.out.println("测试分支合并");
    }
}

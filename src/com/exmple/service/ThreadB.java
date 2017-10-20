package com.exmple.service;

/**
 * @Author: Administrator
 * @Date: 15:03 2017/10/11
 * @Description:
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}

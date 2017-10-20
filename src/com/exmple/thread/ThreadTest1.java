package com.exmple.thread;

/**
 * @Author: Administrator
 * @Date: 11:38 2017/10/11
 * @Description:
 */
public class ThreadTest1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.print("ThreadTest1运行");
    }

    public static void main(String[] args){
        ThreadTest1 threadTest1 = new ThreadTest1();
        threadTest1.start();
        System.out.print("线程结束  ");

    }
}

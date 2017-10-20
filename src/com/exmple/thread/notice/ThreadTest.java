package com.exmple.thread.notice;

/**
 * @Author: Administrator
 * @Date: 17:27 2017/10/11
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args){
        MyList list = new MyList();

        ThreadA threadA = new ThreadA(list);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(list);
        threadB.setName("B");
        threadB.start();
    }
}

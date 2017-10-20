package com.exmple.service;

/**
 * @Author: Administrator
 * @Date: 15:05 2017/10/11
 * @Description:
 */
public class TestRun {
    public static void main(String[] args){
        HasSelfPrivateNum selfPrivateNum = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(selfPrivateNum);
        threadA.start();

        ThreadB threadB = new ThreadB(selfPrivateNum);
        threadB.start();

    }
}

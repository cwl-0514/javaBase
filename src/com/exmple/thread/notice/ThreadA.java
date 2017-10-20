package com.exmple.thread.notice;

/**
 * @Author: Administrator
 * @Date: 17:15 2017/10/11
 * @Description:
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList myList) {
        super();
        this.list = myList;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0;i<10;i++){
                list.add();
                System.out.printf("添 加 了" +(i+1)+" 个 元 素");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

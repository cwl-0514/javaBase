package com.exmple.thread.notice;

/**
 * @Author: Administrator
 * @Date: 17:22 2017/10/11
 * @Description:
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                if (list.sized() == 5){
                    System.out.printf("==5了,线程b要退出了");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

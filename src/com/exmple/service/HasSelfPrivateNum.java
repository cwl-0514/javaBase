package com.exmple.service;

/**
 * @Author: Administrator
 * @Date: 14:52 2017/10/11
 * @Description:
 */
public class HasSelfPrivateNum {
    private  int num = 0;
   synchronized public void addI(String username){
        try {
            if(username.equals("a")){
                num = 100;
                System.out.print("a set over ");
                Thread.sleep(200);
            }else{
                num = 200;
                System.out.print("b set over  ");
            }
            System.out.printf("username = "+username + "  num = "+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

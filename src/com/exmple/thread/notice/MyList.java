package com.exmple.thread.notice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 17:12 2017/10/11
 * @Description:
 */
public class MyList {
    private List list = new ArrayList<>();

    public void add(){
        list.add("陈文龙");
    }
    public int sized(){
       return list.size();
    }
}

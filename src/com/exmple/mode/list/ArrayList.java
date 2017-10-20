package com.exmple.mode.list;

/**
 * @Author: Administrator
 * @Date: 14:51 2017/10/10
 * @Description:
 */
public class ArrayList {
   /* List<String> strList = new ArrayList<String>();
    List<String> strList2 = new ArrayList<String>(2);*/

    private transient Object[] elementData;//elementData存储ArrayList内的元素

    private int size;//size表示它包含的元素的数量,就是存进在list里面的数据
    // 构造方法,initialCapacity来初始化elementData数组的大小
    public ArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);

        this.elementData = new Object[initialCapacity];//在这初始化数组的大小
    }

    /**
     * . 无参构造函数
     */
    public ArrayList() {
        this(10);
    }
}

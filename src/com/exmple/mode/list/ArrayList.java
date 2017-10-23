package com.exmple.mode.list;

/**
 * @Author: Administrator
 * @Date: 14:51 2017/10/10
 * @Description:
 */
public class ArrayList {
   /* List<String> strList = new ArrayList<String>();
    List<String> strList2 = new ArrayList<String>(2);*/

    private transient Object[] elementData;//elementData�洢ArrayList�ڵ�Ԫ��

    private int size;//size��ʾ��������Ԫ�ص�����,���Ǵ����list���������
    // ���췽��,initialCapacity����ʼ��elementData����Ĵ�С
    public ArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);

        this.elementData = new Object[initialCapacity];//�����ʼ������Ĵ�С
    }

    /**
     * . �޲ι��캯��
     */
    public ArrayList() {
        this(10);
    }
}

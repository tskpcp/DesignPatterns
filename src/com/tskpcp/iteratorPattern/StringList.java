package com.tskpcp.iteratorPattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 实现一个StringList的集合类；
 */
public class StringList implements Container {

    public static final int DEFAULT_CAPACITY=10;

    private String[] values;//存放字符串
    private int capacity;//数组容量
    private int size;//已存放数据

    public StringList(){
        values=new String[DEFAULT_CAPACITY];
        capacity=DEFAULT_CAPACITY;
        size=0;
    }
    public void add(String value){
        if(size>=capacity){
            grow();
        }
        values[size++]=value;
    }
    /*
    增长空间
     */
    private void grow(){
        capacity=capacity+capacity/2;
        String[] temp=new String[capacity];
        System.arraycopy(values,0,temp,0,size);
        values=temp;
    }
    public String get(int index){
        if(size<=0){
            return  null;
        }
        if(index<0){
            return  null;
        }
        if(index>=size){
            return null;
        }
        size--;
        return  values[index];
    }
    public int size(){
        return  size;
    }
    @Override
    public Interator inrerator() {
        return new StringInterator();
    }
    /*
    遍历实现
     */
    private class StringInterator implements Interator{
        private int count=0;

        @Override
        public boolean hasNext() {
            return count<size;
        }

        @Override
        public String next() {
            return values[count++];
        }
    }
}

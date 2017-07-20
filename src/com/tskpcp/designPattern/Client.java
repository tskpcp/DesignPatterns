package com.tskpcp.designPattern;

/**
 * Created by gongtuo on 2017/6/6.
 */
public class Client {
    public static void main(String[] args){
        ObjectStructure flowes=new ObjectStructure();
        /*
        对象结构添加元素
         */
        flowes.attach(new Rose());
        flowes.attach(new Lily());
        /*
        访问者造访
         */
        flowes.accept(new Bee());
        flowes.accept(new Bird());
    }
}

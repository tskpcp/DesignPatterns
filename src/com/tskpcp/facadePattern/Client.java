package com.tskpcp.facadePattern;

/**
 * Created by gongtuo on 2017/6/19.
 * 外观模式
 */
public class Client {
    public static void main(String[] args){
        Computer computer=new Computer();
        computer.powerOn();
        System.out.println();
        computer.powerOff();
    }
}

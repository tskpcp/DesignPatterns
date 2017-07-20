package com.tskpcp.adapterPattern;

/**
 * Created by gongtuo on 2017/6/15.
 * 类的适配器模式，利用继承实现
 */
public class ClassAdapter extends TypeC implements USB {
    @Override
    public void chargeUSB() {
        System.out.println("Charge by USB");
    }
}

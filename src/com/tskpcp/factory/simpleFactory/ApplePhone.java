package com.tskpcp.factory.simpleFactory;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class ApplePhone implements IPhone {

    @Override
    public void call(){
        System.out.println("Call use Apple phone");
    }
}
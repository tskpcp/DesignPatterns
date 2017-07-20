package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 */
public class MiPhone implements  IPhone {
    @Override
    public void call(){
        System.out.println("Call used Mi Phone");
    }
}

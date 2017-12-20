package com.designPatterns.factory.simpleFactory;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class MiPhone implements IPhone {

    @Override
    public void call(){
        System.out.println("Call use Mi phone");
    }
}

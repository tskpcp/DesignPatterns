package com.tskpcp.strategyPattern;

/**
 * Created by gongtuo on 2017/5/27.
 */
public class Car implements Vehicle {

    @Override
    public void go(String address){
        System.out.println("I `ll go"+address+"by Car.");
    }
}

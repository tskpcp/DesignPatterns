package com.designPatterns.strategyPattern;

/**
 * Created by gongtuo on 2017/5/27.
 */
public class Train implements Vehicle {
    @Override
    public void go(String address) {
        System.out.println("I `ll go"+address+"by Train.");
    }
}

package com.tskpcp.designPattern;

/**
 * Created by gongtuo on 2017/6/6.
 */
public class Bird implements Visitor {
    @Override
    public void visite(Rose rose) {
        System.out.println("Bird visite rose");
    }

    @Override
    public void visite(Lily lily) {
        System.out.println("Bird visitie lily");
    }
}

package com.tskpcp.designPattern;

/**
 * Created by gongtuo on 2017/6/6.
 */
public class Bee implements Visitor {
    @Override
    public void visite(Rose rose) {
        System.out.println("Bee visite rose");
    }

    @Override
    public void visite(Lily lily) {
        System.out.println("Bee visitie lily");
    }
}

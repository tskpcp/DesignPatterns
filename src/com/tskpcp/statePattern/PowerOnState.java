package com.tskpcp.statePattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 开机
 */
public class PowerOnState implements TVState {
    @Override
    public void prevChannel() {
        System.out.println("previous channel");
    }

    @Override
    public void nextChannel() {
        System.out.println("next channel");
    }

    @Override
    public void turnUp() {
        System.out.println("turn up");
    }

    @Override
    public void turnDown() {
        System.out.println("turn down");
    }
}

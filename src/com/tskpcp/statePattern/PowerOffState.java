package com.tskpcp.statePattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 关机
 */
public class PowerOffState implements TVState {
    @Override
    public void prevChannel() {
        System.out.println("Please power on");
    }

    @Override
    public void nextChannel() {
        System.out.println("Please power on");
    }

    @Override
    public void turnUp() {
        System.out.println("Please power on");
    }

    @Override
    public void turnDown() {
        System.out.println("Please power on");
    }
}

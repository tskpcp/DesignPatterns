package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 */
public class AppleComputer implements IComputer {
    @Override
    public void compute(){
        System.out.println("Compute by Apple computer");
    }
}
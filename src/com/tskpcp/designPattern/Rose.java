package com.tskpcp.designPattern;



/**
 * Created by gongtuo on 2017/6/6.
 */
public class Rose implements  Flower {
    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }
}

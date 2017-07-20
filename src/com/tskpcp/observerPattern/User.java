package com.tskpcp.observerPattern;

/**
 * Created by gongtuo on 2017/5/26.
 */
public class User implements Observer {
    @Override
    public void update(Observable observable,String data){
        System.out.println(data);
    }
}

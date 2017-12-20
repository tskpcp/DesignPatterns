package com.designPatterns.observerPattern;

/**
 * Created by gongtuo on 2017/5/26.
 * 观察者
 */
public interface Observer {
    public void update(Observable observable,String data);
}

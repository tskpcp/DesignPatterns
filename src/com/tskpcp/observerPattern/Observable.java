package com.tskpcp.observerPattern;

/**
 * Created by gongtuo on 2017/5/26.
 * 被观察者
 */
public interface Observable {
    /*
    订阅
     */
    public void subscribe(Observer observer);
    /*
    取消订阅
     */
    public void unsubscribe(Observer observer);
    /*
    发布通知
     */
    public void notify(String data);
}

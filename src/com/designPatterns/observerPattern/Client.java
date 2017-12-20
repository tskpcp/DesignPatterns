package com.designPatterns.observerPattern;

/**
 * Created by gongtuo on 2017/5/26.
 * 观察者模式
 */
public class Client {
    public static void main(String[] agrs){
        Observable magazine=new Magazine();

        Observer xiaoming=new User();
        magazine.subscribe(xiaoming);

        Observer meimei=new User();
        magazine.subscribe(meimei);

        magazine.notify("hello");
    }
}

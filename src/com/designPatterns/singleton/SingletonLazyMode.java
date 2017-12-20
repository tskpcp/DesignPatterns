package com.designPatterns.singleton;

/**
 * Created by gongtuo on 2017/5/24
 * 懒汉模式.
 */
public class SingletonLazyMode {
    private SingletonLazyMode(){}

    private static SingletonLazyMode singleton;

    public static synchronized  SingletonLazyMode getSingleton(){
        if(singleton==null){
                singleton=new SingletonLazyMode();
        }
        return singleton;
    }

    public void show(){
        System.out.println("This is Singleton");
        System.out.println("这个就是懒汉模式的单例模式");
    }
}

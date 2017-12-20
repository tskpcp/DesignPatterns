package com.designPatterns.singleton;

/**
 * Created by gongtuo on 2017/5/24.
 *
 * 双检测模式：
 */
public class SingletonDoubleDetectionMode {
    private  SingletonDoubleDetectionMode(){}

    private  volatile static SingletonDoubleDetectionMode singleton;

    public static SingletonDoubleDetectionMode getInstance(){
        if(singleton==null){
            synchronized (SingletonDoubleDetectionMode.class){
                singleton=new SingletonDoubleDetectionMode();
            }
        }
        return singleton;
    }
    public void show(){
        System.out.println("This is Singleton");
        System.out.println("这个就是双检测模式的单例模式");
    }
}

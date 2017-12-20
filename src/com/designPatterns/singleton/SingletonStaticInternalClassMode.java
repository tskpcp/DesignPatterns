package com.designPatterns.singleton;

/**
 * Created by gongtuo on 2017/5/24.
 * 静态内部类模式：
 */
public class SingletonStaticInternalClassMode {
    private SingletonStaticInternalClassMode(){}
    /*
        定义实例持有静态内部类
     */
    private static class SingletonHolder{
        private static final SingletonStaticInternalClassMode SINGLETON=new SingletonStaticInternalClassMode();
    }

    public static SingletonStaticInternalClassMode getInstance(){
        return SingletonHolder.SINGLETON;
    }

    public void show(){
        System.out.println("This is Singleton");
        System.out.println("这个就是静态内部类模式的单例模式");
    }


}

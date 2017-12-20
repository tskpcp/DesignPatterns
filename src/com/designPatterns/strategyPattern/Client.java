package com.designPatterns.strategyPattern;

/**
 * Created by gongtuo on 2017/5/27.
 */
public class Client {
    public static void main(String[] agrs){
        /*
        开始使用火车进行旅行
         */
        Travel travel=new Travel("tttt");
        travel.travel();
        /*
        后来改变了策略使用飞机
         */
        travel.setVehicle(new Plane());
        travel.travel();
    }
}

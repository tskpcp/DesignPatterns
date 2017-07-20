package com.tskpcp.designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个对象结构封装各元素并提供访问接口
 * Created by gongtuo on 2017/6/6.
 */
public class ObjectStructure {
    private List<Flower> flowers;

    public ObjectStructure(){
        flowers=new ArrayList<>();
    }
    public void attach(Flower flower){
        flowers.add(flower);
    }
    public void detach(Flower flower){
        flowers.remove(flower);
    }
    /*
    接受访问者的操作
     */
    public void accept(Visitor visitor){
        for(Flower flower:flowers){
            flower.accept(visitor);
        }
    }
}

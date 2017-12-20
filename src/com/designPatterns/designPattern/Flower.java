package com.designPatterns.designPattern;



/**
 * 元素类
 * Created by gongtuo on 2017/6/6.
 */
public interface Flower {
    /*
    接受访问
     */
    void accept(Visitor visitor);
}

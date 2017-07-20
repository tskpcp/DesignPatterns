package com.tskpcp.iteratorPattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 定义Iterator接口
 */
public interface Interator {

    /*
    还有元素么
     */
    boolean hasNext();

    /*
    取出下一个元素
     */
    String next();
}

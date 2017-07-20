package com.tskpcp.designPattern;

/**
 * 定义访问者接口及访问者类
 * Created by gongtuo on 2017/6/6.
 */
public interface Visitor {
        /*
        访问数据
         */
        void visite(Rose rose);

        void visite(Lily lily);
}

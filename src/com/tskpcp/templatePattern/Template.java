package com.tskpcp.templatePattern;

/**
 * Created by gongtuo on 2017/6/2
 * 创建模板.
 */
public abstract class Template {
    public void show(){
        showTitle();
        showContent();
    }
    private void showTitle(){
        System.out.println("By Leo");
    }
    protected  abstract  void showContent();
}

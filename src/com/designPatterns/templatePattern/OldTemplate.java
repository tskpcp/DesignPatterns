package com.designPatterns.templatePattern;

/**
 * Created by gongtuo on 2017/6/2.
 */
public class OldTemplate extends Template {
    @Override
    protected void showContent() {
        System.out.println("This is an old template");
    }
}

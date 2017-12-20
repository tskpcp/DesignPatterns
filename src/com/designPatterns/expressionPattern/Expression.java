package com.designPatterns.expressionPattern;

/**
 * Created by gongtuo on 2017/6/2.
 * . 定义解释器表达式接口；
 */
public interface Expression {
    boolean interpret(String context);
}

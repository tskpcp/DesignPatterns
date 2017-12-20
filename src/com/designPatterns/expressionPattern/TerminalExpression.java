package com.designPatterns.expressionPattern;

/**
 * Created by gongtuo on 2017/6/2.
 * . 定义解释器表达式接口；
 */
public class TerminalExpression implements Expression {
    private  String data;
    public TerminalExpression(String data){
        this.data=data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

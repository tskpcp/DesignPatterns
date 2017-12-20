package com.designPatterns.expressionPattern;

/**
 * Created by gongtuo on 2017/6/2.
 */
public class Client {
    public static void main(String[] args){
        Expression hello=new TerminalExpression("Hello");
        Expression word=new TerminalExpression("word");
        Expression and=new AndExpression(hello,word);
        System.out.println(and.interpret("Hello word"));
        System.out.println(and.interpret("sdfdsf"));
    }
}

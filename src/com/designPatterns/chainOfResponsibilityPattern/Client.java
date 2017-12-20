package com.designPatterns.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/6/1.
 * 责任链模式
 */
public class Client {
    public static void main(String[] args){
        Handler sensitive=new SensitiveHandler();
        Handler html=new HtmlHandler();
        html.setNext(sensitive);

        String msg="<h1>Fuck the java .</h1>";
        Request req=new Request(msg);
        Response res=new Response();

        html.handleRequest(req,res);

        System.out.println(req.text);
        System.out.println(res.text);

        //---------------------非纯净版责任链模式：------------------------//

        FilterChain chain=new FilterChain();

        chain.addFilter(new HtmlFilter());
        chain.addFilter(new SensitiveFilter());
        String msg1="<h1>Fuck the Java.</h1>";
        Request req1=new Request(msg1);
        Response res1=new Response();

        chain.doFilter(req1,res1,chain);
        System.out.println(req1.text);
        System.out.println(res1.text);

    }
}

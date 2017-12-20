package com.designPatterns.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/7/18.
 */
public interface Filter {

    void doFilter(Request req,Response res,Filter chain);
}

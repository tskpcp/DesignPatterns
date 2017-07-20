package com.tskpcp.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/7/18.
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request req,Response res,Filter chain){
        req.text=req.text.replaceAll("fuck","*");
        chain.doFilter(req,res,chain);
        res.text+="<Sensitive Filter>";
    }
}

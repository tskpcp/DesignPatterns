package com.designPatterns.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/7/18.
 */
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, Filter chain) {
        req.text=req.text.replace("<","/");
        req.text=req.text.replace(">","//");
        chain.doFilter(req,res,chain);
        res.text+="<Html Filter>";
    }
}

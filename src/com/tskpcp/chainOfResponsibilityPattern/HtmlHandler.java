package com.tskpcp.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/6/1.
 */
public class HtmlHandler extends Handler {
    @Override
    protected void handleText(Request req, Response res) {
        req.text=req.text.replace("<","/");
        req.text=req.text.replace(">","\\");
        res.text+="<Html Handler>";

    }
}

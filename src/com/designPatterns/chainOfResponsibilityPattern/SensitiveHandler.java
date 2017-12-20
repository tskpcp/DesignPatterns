package com.designPatterns.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/6/1.
 */
public class SensitiveHandler extends Handler {
    @Override
    protected void handleText(Request req, Response res) {
        req.text=req.text.replace("Fuck","*");
        res.text+="<Sensitive Handler>";
    }
}

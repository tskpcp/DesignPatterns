package com.tskpcp.chainOfResponsibilityPattern;

/**
 * Created by gongtuo on 2017/6/1.
 */
public abstract class Handler {
    private Handler next;
    public void setNext(Handler next){
        this.next=next;
    }
    public Handler getNext(){
        return next;
    }
    public void handleRequest(Request req,Response res){
        handleText(req,res);
        if(next != null){
            next.handleRequest(req,res);
        }
    }

    protected abstract void handleText(Request req,Response res);

}

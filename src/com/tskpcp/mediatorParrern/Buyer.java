package com.tskpcp.mediatorParrern;

/**
 * Created by gongtuo on 2017/6/5.
 */
public class Buyer extends Person {
    public Buyer(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void Buy(String message){
        getMediator().contact(message,this);
    }
}

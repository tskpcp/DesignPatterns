package com.designPatterns.mediatorParrern;

/**
 * Created by gongtuo on 2017/6/5.
 */
public class Seller extends Person {
    public Seller(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void Sell(String message){
        getMediator().contact(message,this);
    }
}

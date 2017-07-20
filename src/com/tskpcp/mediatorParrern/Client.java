package com.tskpcp.mediatorParrern;

/**
 * Created by gongtuo on 2017/6/5.
 * 中介者模式
 */
public class Client {
    public static void main(String[] args){
        Mediator mediator=new ConcreteMediator();

        Seller seller=new Seller("SELLER",mediator);
        Buyer buyer=new Buyer("BUYER",mediator);

        seller.Sell("sell");
        buyer.Buy("buy");
    }
}

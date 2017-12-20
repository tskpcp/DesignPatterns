package com.designPatterns.factory.simpleFactory;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class Client {
    public  static void main(String[] args){
        IPhone phone=PhoneFacotry.getPhone("Apple");
        phone.call();
        phone=PhoneFacotry.getPhone("Mi");
        phone.call();
    }
}

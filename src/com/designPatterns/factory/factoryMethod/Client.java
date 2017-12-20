package com.designPatterns.factory.factoryMethod;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class Client {
    public static void main(String[] args){
        IFactory miFactory=new MiFactory();
        IPhone miPhone=miFactory.newPhone();
        miPhone.call();

        IFactory appleFactory=new AppleFactory();
        IPhone applePhone=appleFactory.newPhone();
        applePhone.call();
    }
}

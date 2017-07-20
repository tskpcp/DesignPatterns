package com.tskpcp.factory.factoryMethod;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class AppleFactory implements IFactory {
    @Override
    public IPhone newPhone(){
        return new ApplePhone();
    }
}

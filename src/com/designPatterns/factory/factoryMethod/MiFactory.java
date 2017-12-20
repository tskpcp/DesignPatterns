package com.designPatterns.factory.factoryMethod;

/**
 * Created by gongtuo on 2017/5/24.
 */
public class MiFactory implements IFactory {

    @Override
    public IPhone newPhone(){
        return new MiPhone();
    }
}

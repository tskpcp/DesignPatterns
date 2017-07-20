package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 */
public class AppleFactory implements IFactory {

    @Override
    public IPhone getPhone(){
        return new ApplePhone();
    }

    @Override
    public IComputer getComputer(){
        return new AppleComputer();
    }
}

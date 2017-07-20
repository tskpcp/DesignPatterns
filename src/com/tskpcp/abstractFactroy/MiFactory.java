package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 */
public class MiFactory implements IFactory {
    @Override
    public IPhone getPhone(){
        return new MiPhone();
    }

    @Override
    public IComputer getComputer(){
        return  new MiComputer();
    }
}

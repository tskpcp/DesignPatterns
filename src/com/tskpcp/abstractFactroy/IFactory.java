package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 */
public interface IFactory {
    IPhone getPhone();
    IComputer getComputer();
}

package com.tskpcp.abstractFactroy;

/**
 * Created by gongtuo on 2017/5/25.
 * 抽象工厂
 */
public class Client {
    public static void main(String[] args){
        IFactory factory=new MiFactory();
        IPhone phone=factory.getPhone();
        IComputer computer=factory.getComputer();

        phone.call();
        computer.compute();

    }
}

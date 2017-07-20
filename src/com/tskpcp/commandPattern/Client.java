package com.tskpcp.commandPattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public class Client {
    public static void main(String[] args){
        ICommand command=new Command();
        Invoker invoker=new Invoker(command);
        invoker.execute("Fire");
    }
}

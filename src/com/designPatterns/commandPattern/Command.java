package com.designPatterns.commandPattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public class Command implements ICommand {
    private Receiver receiver;
    public  Command(){
        this.receiver=new Receiver();
    }

    @Override
    public void execute(String cmd) {
        receiver.action(cmd);
    }
}

package com.designPatterns.commandPattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 创建命令请求者
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand  command){
        this.command=command;
    }

    public void setCommand(Command command){
        this.command=command;
    }

    public void execute(String cmd){
        command.execute(cmd);
    }
}

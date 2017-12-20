package com.designPatterns.commandPattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public class Receiver {
        public void action(String cmd){
            System.out.println("I executed the command-" + cmd + ".");
        }
}

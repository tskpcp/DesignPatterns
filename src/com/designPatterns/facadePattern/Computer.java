package com.designPatterns.facadePattern;

/**
 * Created by gongtuo on 2017/6/19.
 * 外观类
 */
public class Computer {
    private CPU cpu;
    private Disk  disk;
    private  Menory menory;

    public Computer(){
        cpu=new CPU();
        disk=new Disk();
        menory=new Menory();
    }

    public void powerOn(){
        System.out.println("Computer starting.....");
        cpu.start();
        menory.start();
        disk.start();
        System.out.println("Computer started");
    }

    public void powerOff(){
        System.out.println("Computer stoping.....");
        cpu.end();
        menory.end();
        disk.end();
        System.out.println("Computer stoped");
    }
}

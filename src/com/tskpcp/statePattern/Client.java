package com.tskpcp.statePattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public class Client {
    public static void main(String[] agrs){
        /*
        电视机默认为关机状态
         */
        TVController controller=new TVController();
        controller.nextChannel();
        /*
        开机
         */
        controller.powerOn();
        controller.nextChannel();
        /*
        关机
         */
        controller.powerOff();
        controller.nextChannel();
    }
}

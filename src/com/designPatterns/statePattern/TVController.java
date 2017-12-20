package com.designPatterns.statePattern;

/**
 * Created by gongtuo on 2017/5/31.
 * 使用遥控器作为行为的封装类
 */
public class TVController implements TVState {

    private TVState state;

    public TVController(){
        state=new PowerOffState();
    }

    public void powerOn(){
        state=new PowerOnState();
    }

    public void powerOff(){
        state=new PowerOffState();
    }
    @Override
    public void prevChannel() {
        state.prevChannel();
    }

    @Override
    public void nextChannel() {
        state.nextChannel();
    }

    @Override
    public void turnUp() {
        state.turnUp();
    }

    @Override
    public void turnDown() {
        state.turnDown();
    }
}

package com.designPatterns.mementoPattern;

/**
 * 备忘录类
 * Created by gongtuo on 2017/6/1.
 */
public abstract class Memento {
    private  State state;
    public  Memento(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
    public void setState(State state){
        this.state=state;
    }
}

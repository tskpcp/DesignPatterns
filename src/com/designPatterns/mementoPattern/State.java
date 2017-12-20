package com.designPatterns.mementoPattern;

/**
 * 封装的状态实体类
 * Created by gongtuo on 2017/6/1.
 */
public class State implements Cloneable {
    public  String name;
    public String info;
    public State(String name,String info){
        this.name=name;
        this.info=info;
    }
    @Override
    protected State clone(){
        State state=null;
        try{
            state=(State)super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return state;
    }
}

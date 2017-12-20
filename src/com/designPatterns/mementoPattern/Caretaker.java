package com.designPatterns.mementoPattern;

/**
 * 管理者类
 *
 * Created by gongtuo on 2017/6/1.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento=memento;
    }
}

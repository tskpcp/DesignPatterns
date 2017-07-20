package com.tskpcp.mementoPattern;

/**
 * Created by gongtuo on 2017/6/1.
 */
public class Client {
    public static void main(String[] args){
        State state=new State("打Boss","一起去打Boss");
        Game game=new Game(state);

        Memento memento=game.createMemento();
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(memento);

        game.play();
        game.show();

        game.restore(caretaker.getMemento());
        game.show();
    }
}

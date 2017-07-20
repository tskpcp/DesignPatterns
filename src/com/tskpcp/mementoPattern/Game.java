package com.tskpcp.mementoPattern;

/**
 * Created by gongtuo on 2017/6/1.
 *
 */
public class Game {
        private State state;
        public Game(State state){
            this.state=state;
        }
        public void play(){
            state.name="打boss结束";
            state.info="没有打过boss";

        }
        public void show(){
            System.out.println(state.name+":"+state.info);
        }

        /*
        备份
         */
        public Memento createMemento(){
            return new GameMemento(state.clone());
        }
        /*
        恢复
         */
        public void restore(Memento memento){
            state=memento.getState();
        }
}

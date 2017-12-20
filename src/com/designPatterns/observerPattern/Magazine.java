package com.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongtuo on 2017/5/26.
 */
public class Magazine implements Observable {
        private List<Observer> observers;

        public Magazine(){
            this.observers=new ArrayList<>();
        }
        @Override
         public  void subscribe(Observer observer){
            this.observers.add(observer);
        }

         @Override
         public void unsubscribe(Observer observer){
             this.observers.add(observer);
         }

         @Override
        public void notify(String data){
             for(Observer observer:observers){
                 observer.update(this,data);
             }
         }
}

package com.designPatterns.mediatorParrern;

/**
 * Created by gongtuo on 2017/6/5.
 */
public class ConcreteMediator implements Mediator {
    @Override
    public void contact(String message, Person person) {
        System.out.println(person.getName()+":"+message);
    }
}

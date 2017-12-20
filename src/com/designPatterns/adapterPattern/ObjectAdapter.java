package com.designPatterns.adapterPattern;

/**
 * Created by gongtuo on 2017/6/15.
 * 对象的适配器模式，利用组合实现
 */
public class ObjectAdapter implements USB {

    private TypeC typec;

    public ObjectAdapter(TypeC typec){
        this.typec=typec;
    }
    @Override
    public void chargeUSB() {
        System.out.println("Charging by USB");
    }

    @Override
    public void chargeTypeC() {
        typec.chargeTypeC();
    }
}

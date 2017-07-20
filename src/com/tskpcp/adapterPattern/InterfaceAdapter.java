package com.tskpcp.adapterPattern;

/**
 * Created by gongtuo on 2017/6/15.
 * 接口的适配器模式，定义抽象类实现其中一部分接口
 */
public abstract class InterfaceAdapter implements USB {
    private TypeC typeC;

    public InterfaceAdapter(TypeC typeC){
        this.typeC=typeC;
    }

    @Override
    public void chargeTypeC() {
        typeC.chargeTypeC();
    }
}

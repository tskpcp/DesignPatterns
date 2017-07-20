package com.tskpcp.adapterPattern;

/**
 * Created by gongtuo on 2017/6/15.
 */
public class Client {
    public static void main(String[] args){
        USB u=new ClassAdapter();
        u.chargeTypeC();
        u.chargeUSB();

        USB us=new ObjectAdapter(new TypeC());
        us.chargeTypeC();
        us.chargeUSB();

        USB usb=new InterfaceAdapter(new TypeC()) {
            @Override
            public void chargeUSB() {
                System.out.println("Charging by USB");
            }
        };

    }
}

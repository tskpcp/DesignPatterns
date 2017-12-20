package com.designPatterns.factory.simpleFactory;

/**
 * Created by gongtuo on 2017/5/24.
 *
 * 简单工厂
 */
public class PhoneFacotry {
    public static IPhone getPhone(String type){
        IPhone phone=new MiPhone();
        if("Apple".equalsIgnoreCase(type)){
            phone=new ApplePhone();
        }
        return phone;
    }
}

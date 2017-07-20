package com.tskpcp.prototypePattern;

/**
 * Created by gongtuo on 2017/5/26.
 */
public class Client {
    public static void main(String[] args){
        //本体
        Resume resume=new Resume("dsf",34,"sadasd",3);
        resume.show();
        //克隆体
        Resume copy=resume.clone();
        copy.name="dsfwe";
        copy.age=12;
        copy.skill="sdsdf";
        copy.year=4;

        copy.show();
        resume.show();
    }
}

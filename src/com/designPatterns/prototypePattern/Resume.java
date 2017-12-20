package com.designPatterns.prototypePattern;

/**
 * Created by gongtuo on 2017/5/26.
 * 原型模式
 */
public class Resume implements Cloneable {
    public String name;
    public int age;
    public String skill;
    public int year;

    public Resume(String name,int age,String skill,int year){
        this.name=name;
        this.age=age;
        this.skill=skill;
        this.year=year;
    }

    public void show(){
        String message="My name is %s,I am %d year old ."+"I am good at %s, I have %d years experience";
        System.out.println(String.format(message,name,age,skill,year));
    }

    @Override
    protected Resume clone(){
        Resume resume=null;
        try{
            resume=(Resume)super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return resume;
    }
}

package com.tskpcp.builderPattern;


/**
 * Created by gongtuo on 2017/5/25.
 * 简单建造者模式
 */
public class Programmer {
    private String name;
    private int age;
    private String computer;
    private String phone;
    private String clothes;

    public Programmer(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.computer=builder.computer;
        this.phone=builder.phone;
        this.clothes=builder.clothes;
    }

    public void show(){
        System.out.println(String.format("My name is %s,I am %d years old,I use %s computer and %s phone,I war %s.",name,age,computer,phone,clothes));
    }
    /*
    建造者对象
     */
    static class Builder{
        private String name;
        private int age;
        private String computer;
        private String phone;
        private String clothes;

        public Builder(){
            name="dsfsdf";
            age=1;
            computer="macbook";
            phone="324";
            clothes="T-shirt";
        }
        public Builder name(String name){
            this.name=name;
            return  this;
        }
        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder computer(String computer){
            this.computer=computer;
            return this;
        }
        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }
        public Builder clothes(String clothes){
            this.clothes=clothes;
            return this;
        }
        public Programmer build(){
            return new Programmer(this);
        }
    }
}

package com.tskpcp.builderPattern;

/**
 * Created by gongtuo on 2017/5/25.
 */
public class client {
    public static void main(String[] args){
        Programmer programmer=new Programmer.Builder().name("aa").age(12).computer("hp")
.phone("mi").clothes("hm").build();

        programmer.show();
    }
}

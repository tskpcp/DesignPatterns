package com.tskpcp.iteratorPattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public class Client {
    public static void main(String[] agrs){
        StringList names=new StringList();
        names.add("sfddsf");
        names.add("wqewqewq");
        names.add("azxcczxc");


        Interator interator=names.inrerator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }
    }
}

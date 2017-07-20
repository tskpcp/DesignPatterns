package com.tskpcp.templatePattern;

/**
 * Created by gongtuo on 2017/6/2.
 */
public class Client {
    public static void main(String[] args){
        Template template=null;
         template=new SimpleTemplate();
         template.show();

         System.out.println();

         template=new OldTemplate();
         template.show();

    }
}


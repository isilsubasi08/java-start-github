package com.company;

public class Main {


    public static void main(String[] args) {
       // new Thread(new Birinci()).start();
        Thread t1=new Thread(new Birinci());
        t1.start();

        Thread t2=new Thread(new Ikinci());
        t2.start();

    }
}

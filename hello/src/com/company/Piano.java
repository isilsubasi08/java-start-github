package com.company;

public class Piano implements Instrument,HouseDecor{

    //Property
    String brand;
    boolean digital;


    @Override
    public void info() {
        System.out.println("interface <3");
    }
}

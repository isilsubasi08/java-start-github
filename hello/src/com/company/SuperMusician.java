package com.company;

public class SuperMusician extends Musicians{

    public SuperMusician(String name, String instrumant, int age) {
        //Extends ettiğim Musicians sınıfına REFERANS verir.
        //Musicians(name,instrument,age); aslında aynı şey
        super(name, instrumant, age);
    }

    public String sing(){

        return "Nothing Else Matters";
    }

}

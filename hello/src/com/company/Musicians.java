package com.company;

public class Musicians {

    //Property
    private String name;
    private String instrumant;
    private int age;

    public Musicians(String name, String instrumant, int age) {
        this.name = name;
        this.instrumant = instrumant;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getInstrumant() {
        return instrumant;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrumant(String instrumant) {
        this.instrumant = instrumant;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

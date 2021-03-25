package com.company;

public class BMW extends Araba implements ArabaSayisi{

    public int arabaSayisi;
    @Override
    public int arabaSayisi() {
        arabaSayisi=arabaSayisi+1;
        return arabaSayisi;
    }
}

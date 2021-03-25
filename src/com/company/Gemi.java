package com.company;

public class Gemi extends Tasit{
    @Override
    public String getType() {
        return "Gemi";
    }

    @Override
    public int yolcuKapasitesi() {
        int yolcuMaxKapasite=100;
        return yolcuMaxKapasite;
    }

    @Override
    public int varisHizi() {
        int varisHiziYüzde=25;
        return varisHiziYüzde;
    }

}

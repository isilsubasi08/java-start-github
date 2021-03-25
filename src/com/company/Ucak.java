package com.company;

public class Ucak extends Tasit{
    @Override
    public String getType() {
        return "Ucak";
    }

    @Override
    public int yolcuKapasitesi() {
        int yolcuMaxKapasite=200;
        return yolcuMaxKapasite;
    }

    @Override
    public int varisHizi() {
        int varisHiziYüzde=90;
        return varisHiziYüzde;
    }


}

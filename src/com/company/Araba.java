package com.company;

public class Araba extends Tasit{

    public int arabaSayisi(){
       int arabaSayi=0;
       arabaSayi=arabaSayi+1;
       return arabaSayi;
  }

    @Override
    public String getType() {
        return "Araba";
    }

    @Override
    public int yolcuKapasitesi() {
        int yolcuMaxKapasite=40;
        return yolcuMaxKapasite;
    }

    @Override
    public int varisHizi() {
        int varisHiziYüzde=45;
        return varisHiziYüzde;
    }


}

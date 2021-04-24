package com.company;

import java.util.Scanner;

public class Emlak {

    private String EvTipi;
    private String il;
    private int odaSayisi;
    private double fiyat;

    public String getEvTipi() {
        return EvTipi;
    }

    public String getIl() {
        return il;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setEvTipi(String evTipi) {
        EvTipi = evTipi;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Emlak(String evTipi, String il, int odaSayisi, double fiyat) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ev Tipi:");
        this.EvTipi=input.next();

        System.out.println("İl:");
        this.il = input.next();

        System.out.println("Oda Sayisi:");
        this.odaSayisi = input.nextInt();

        System.out.println("Fiyat");
        this.fiyat = input.nextInt();
    }

    public void ListeleEmlak(){

        System.out.println("\nEv Tipi :" +EvTipi + "\nIl :" + il +"\nOda Sayisi :" + odaSayisi + "\nFiyat :" +fiyat+" TL");
    }
    public String toString(){
        return EvTipi +" "+ il +" "+ odaSayisi + " "+ fiyat;

    }



}

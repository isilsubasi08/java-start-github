package com.company;

public class Ikinci implements Runnable {


    private int sayi=50;

    public Ikinci() {
    }

    @Override
    public void run() {

        //50'den 35'e kadar olan değerleri yazmasını istiyorsam(35 dahil değil)
        while (sayi>35){
            System.out.println("Geri y:  "+sayi);
            sayi--;
        }

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 37;
        int sayi2 = 45;
        int sayi3 = 67;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        //System.out.println("En buyuk:"+enBuyuk);

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz.");
                break;
            case 'B':
            case 'C':
                System.out.println("Ortalama");
                break;
            case 'D':
                System.out.println("Fenaaa");
                break;
            case 'F':
                System.out.println("Kaldınız üzgünüm");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }

        //for loop

        for(int i=0;i<10;i++){

            System.out.println(i);
        }
        System.out.println("Döngü sonu");




    }
}

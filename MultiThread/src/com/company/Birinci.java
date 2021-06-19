package com.company;

public class Birinci implements Runnable {

    private int sayi=0;

    public Birinci() {
    }

    @Override
    public void run() {

        //10'dan küçük olduğu sürece yazdırmasını istiyorsam
        while (sayi<10){
            System.out.println("İleri x:  "+sayi);
            sayi++;
            //sleep metoduyla verilen milisaniyeyle uyumasını sağlıyabiliyorum.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }
}

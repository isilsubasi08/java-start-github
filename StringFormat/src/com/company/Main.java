package com.company;

import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int sayi1=10;
        int sayi3=30;
        //Integer degerleri %d ile printf() metoduyla ekranda gösterebiliriz.
        System.out.printf("%d%d%d%n",sayi1,20,sayi3);
        //Arada boşluk bırakmak istersek, karakter kullanarak yapacağız.
        System.out.printf("%d%c%d%c%d%n",sayi1,' ',20,' ',sayi3);

        //float değer için %f kullanacağız.
        System.out.printf("%f%n",3.14);//Ama virgülden sonra 6 basamak yazdırır.
        //Bunu düzeltmek için aşağıdaki gibi kullanacağız.
        System.out.printf("%,.2f%n",3.14);


        System.out.printf("'%15s' %n", "baeldung");//Sınır belirterek de kullanılabilir.
        System.out.printf("'%-30s' %n", "baeldung");

        System.out.printf("%2.2s%n", "Hi there!");//Sadece Hi yazdıracaktır.

        System.out.printf("'%s' %n", "baeldung");
        System.out.printf("'%S' %n", "baeldung");//%S ile string ifadenin harflerini büyük yapabiliriz.

        System.out.printf(Locale.US, "%,d %n", 10000);//Printf() metodunun 3 parametre aldığı örnek

        Date date = new Date();
        System.out.printf("%tT%n", date);//Tarihi formatlamak içinde kullanılır.
        System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);//Bu şekilde ayırarakda yazdırabiliriz.

    }
}

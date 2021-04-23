package com.company;

public abstract class People {

    //Soyut sınıf:Obje oluşturmaktan öte sınıflara extend edilebilsin diye yapılan sınıflardır.
    //Oluşturulma Amacı:Yüzlerce sınıf üzerinde çalışıyoruz diyelim.
    //Bu yüzlerce sınıfın 40 tane metodu,propertysi birbirine eşit olacak.
    //O yüzden 1 tane abstract class oluşturulur ve kullanılır.

    public String information(){
        return "I'm a people";

    }

}

public class StaticSample {

    static int sayac=0;//sayac değişkenini static tanımladım.
    int degisken=10;
    public static void main(String[] args) {

        StaticSample.sayac++;//sayac değişkenimi artır
        System.out.println(StaticSample.sayac);

        // arttırmayı tekrarlıyorum
        // ... bellek temizlenmediği için aynısının üzerinden sayar

        StaticSample.sayac++;
        System.out.println(StaticSample.sayac);
        deneme();

        StaticSample staticSample=new StaticSample();
        System.out.println("Static olmayan değişken:"+staticSample.degisken);



    }

    public static void deneme(){
        System.out.println("Fonksiyonun içerisi:"+StaticSample.sayac);

    }

}

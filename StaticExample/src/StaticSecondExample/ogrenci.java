package StaticSecondExample;
public class ogrenci {
    private String ad;
    private String soyad;
    private static int mevcut=0;
    public ogrenci(String a, String s) {
        ad=a;
        soyad=s;
        mevcut++;
        System.out.println(ad+" "+soyad+" "+"eklendi.Sınıf mevcudu:"+mevcut);

    }
}

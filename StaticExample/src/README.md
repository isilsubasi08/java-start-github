## STATIC CLASS
# Static anlam olarak "durağan" anlamına gelmektedir.
<ul>
<li> Static anahtar kelimesiyle tanımlanan özellikler veya metotlar bellekte sadece ve sadece bir defa oluşturulur. </li>
<li> Projelerimizi çalıştırırken , ben obje oluşturmasam dahi 1 tane main metodumuz oluşmuş olur.</li>
<li> Bellekte sadece 1 defa oluşuyor.Sadece class'a özgü bir değişken olarak karşımıza çıkıyor.</li>
</ul>

    
```java
public class Main(){

    public void deneme(){
        System.out.println("Deneme");
    }
    public static void main(String[] args){
        deneme();
        //Burası hata verecektir.
    }


}
```
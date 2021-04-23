## OOP Nedir?
**Nesne Yönelimli Programlama**<br>
Önceden "C" gibi diller vardı.Bu dillere prosedürel programlama dili deniyordu.<br>
Java ile Nesne Yönelimli Programlamaya geçildi.<br>
**OOP:**Bir yazılım geliştirme mantıı ve felsefesidir.Gerçek dünyanın programlamaya uyarlnamış halidir de diyebiliriz.<br>
**Nesne Nedir?**
Çevremize baktığımızda gördüğümüz her şey birer nesnedir.Kalem,masa,bilgisayar,bisiklet,insan vb. **Ama yazılım ve programlama için nesne nedir?**
- **Özelliği** ve
- **Niteliği**
  olan herşey.<br>
**OOP**
**4 ana başlıkta incelenir.**<br>
1.Encapsulation<br>
2.Inheritance<br>
3.Poolymorphism<br>
4.Abstraction<br>


>>> Yukarıdaki alıştırmalarımda yaptığım adımlar:<br>

1.User adında bir sınıf oluşturdum. Ve içerisine **name** ve **job** gibi String tipinde propertys(özellikler) ekledim.<br>
2.Main Clasıma gidip oluşturduğum bu sınıftan nesneler üretebiliyorum.<br>
```
User myUser=new User();
myUser.name="Işılay";
myUser.job="Sotfware";

User newUser=new User();
newUser.name="Sevgi";
newUser.job="Designer";

```
3.User sınıfımdan nesneler oluşturdum. Ve Özelliklerini değiştirdim.<br>

4.Aynı sınıftan 2 tane nesne oluşturabiliyorum. Ama eğer 1 sınıftan birden fazla nesne oluşturamıyorsam bu sınıfa ne denir?<br>
**Singleton Yapısı** <br><br>
Yukarıda oluşturduğum yapı çok ilkelce,Bunun için **Constructor** kullanmalıyız.<br>
```
public User(String name,String job){
    this.name=name;
    theis.job=job;

}

```
>> thsis.name=name; İçinde bulunduğum sınıfa "REFERANS" veriyor. this.name:Bu projedeki name propertysini çağırıyor.Parantezden aldığım isime eşitliyor.

5.**Constructor:** Bir sınıf oluşturulduğunda **ilk çağrılacak metottur.**Artık Main classda şöyle çağırabiliriz.<br>
```
User muUser=new User("İsilay","Software");


```









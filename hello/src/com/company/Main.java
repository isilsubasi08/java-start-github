package com.company;

public class Main {

    public static void main(String[] args) {

       // System.out.println("Hello");
        /*User myUser=new User();
        myUser.name="Isilay";
        myUser.job="Software";

        User newUser=new User();
        newUser.name="Osman";
        newUser.job="BestPerson";*/

        User myUser=new User("Isilay","Software");
        //System.out.println("myUser namme:"+myUser.name);


        Musicians musicians=new Musicians("İsilay","Guitar",25);
        System.out.println(musicians.getName());
        musicians.setAge(60);
        System.out.println(musicians.getAge());



        SuperMusician lars=new SuperMusician("lars","saz",67);
        System.out.println(lars.sing());
        System.out.println(lars.getName());

        //Static Polymorphism
        Mathematics mt=new Mathematics();
        System.out.println(mt.sum());
        System.out.println(mt.sum(5,6));
        System.out.println(mt.sum(5,6,90));

        //Dinamik Polymorphism
        Animal animal=new Animal();
        animal.sing();
        Dog barley=new Dog();
        barley.sing();
        barley.test();



    }
}

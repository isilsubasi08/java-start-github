package StaticVariables;
public class StaticVariables {

    public static int a;
    public int b;
    public static void Yazdır(StaticVariables sd){
        System.out.println(StaticVariables.a);
    }
    public static void main(String[] args) {
        StaticVariables sd=new StaticVariables();
        StaticVariables sd1=new StaticVariables();
        StaticVariables.a=75;
        sd.b=50;
        sd1.b=30;
        System.out.println(StaticVariables.a);
        System.out.println(sd.b);
        System.out.println(sd1.b);
    }

}

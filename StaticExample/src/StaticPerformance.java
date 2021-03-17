public class StaticPerformance {

    int normalDegisken(int a) {
        // Normal bir değişkeni çağırma metodu
        return a * 2;
    }

    static int staticDegisken(int a) {
        // Burdada static değişkeni çağıran metod
        return a * 2;
    }

    public static void main(String[] args) throws Exception {
        StaticPerformance staticPerformance=new StaticPerformance();

        long t1 = System.currentTimeMillis();

        // ... Normal mdegiskenli metodu cağırıyoruz
        for (int x = 0; x < 100; x++) {
            for (int i = 0; i < 10000000; i++) {
                if (staticPerformance.normalDegisken(i) < 0) {
                    throw new Exception();
                }
            }
        }

        long t2 = System.currentTimeMillis();

        // ... Burdada static değişkenli metodu çağırıyruz
        for (int x = 0; x < 100; x++) {
            for (int i = 0; i < 10000000; i++) {
                if (StaticPerformance.staticDegisken(i) < 0) {
                    throw new Exception();
                }
            }
        }

        long t3 = System.currentTimeMillis();

        // ... EN son aradaki farklarıda ekrana yazdıralım
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        //Static değişkenin çağrıldığı fonksiyon daha hızlı çalışmaktadır.

    }
}

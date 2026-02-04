package DZ11;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        //Добавил в условие проверку разности, если разницы почти нет, то тогда они равны.
        // Если нам не нужна супер точность
        if (Math.abs(a-b) < 0.0000000001) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

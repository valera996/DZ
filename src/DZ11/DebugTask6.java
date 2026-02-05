package DZ11;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }

    //Реализовал задачу с помощью оператора if и цикла while внутри него
    // Учел возможность ввода n > 0, n < 0, n == 0
    //    public static void countdown(int n) {
    //        if(n > 0){
    //            while (n > 0){
    //            System.out.println(n);
    //            n--;
    //        } return;
    //        }if(n < 0) {
    //            while (n <= 1) {
    //                System.out.println(n);
    //                n++;
    //            }
    //        }else {
    //            System.out.println(n);
    //            System.out.println(1);
    //        }
    //    }

    //Вариант 2, после проверки домашней работы
    public static void countdown(int n) {
        if (n > 0) {
            while (n > 0) {
                System.out.println(n);
                n--;
            }
        }
    }
}

package DZ11;

public class DebugTask9 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        //Ссылочные типы данных сравниваются через equals(), исправил это
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

package DZ11;

public class DebugTask4 {
    public static void main(String[] args) {

        //Обработал исключение
        try{
            System.out.println(isPalindrome(null));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean isPalindrome(String str) throws NullPointerException{
        if(str == null){
            throw new NullPointerException("Ошибка, null вводить нельзя");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

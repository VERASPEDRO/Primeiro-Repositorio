package fundamentos;

public class corversaoNumerosString {
    public static void main(String[] args) {

        Integer num1 = 100000;
        System.out.println(num1.toString().length());   /// toString  converter de numero para string

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());
    }
}

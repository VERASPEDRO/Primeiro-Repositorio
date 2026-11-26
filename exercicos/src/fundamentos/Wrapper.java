package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {


       /// Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;  ///.parseInt(entrada.nextLine()); //int
        Long l = 10000L;


        System.out.println(b.byteValue());
        System.out.println(i * 3 );


        Float f =13.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo= Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#'; //char
        System.out.println(c+ "...");

    }

}

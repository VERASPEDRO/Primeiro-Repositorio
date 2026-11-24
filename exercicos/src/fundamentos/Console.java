package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");
        System.out.println("Bom dia");
        System.out.println("Bom dia");
        System.out.println("oi");



        Scanner comeco =  new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = comeco.next();



        System.out.print("digite seu sobrenome: ");
        String sobrenome = comeco.next();

        System.out.println(" %s %s nome + sobrenome);


comeco.close();

    }


}




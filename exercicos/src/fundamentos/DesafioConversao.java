package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in );

        System.out.println("digite o primeiro salario: ");
        String salario1 = teclado.nextLine().replace("," + )

        System.out.println("digite o segundo salario: ");
        String salario2 = teclado.nextLine();

        System.out.println("digite o terceiro salario: ");
        String salario3 = teclado.nextLine();

        Double valor1 = Double.parseDouble(salario1) ;
        Double valor2 = Double.parseDouble(salario2);
        Double valor3 = Double.parseDouble(salario3);

        double total = valor1+valor2+valor3;

        System.out.println("Total e : " + total);

        double media = total/3;

        System.out.println("A media dos trẽs Salarios e :  " + media);
    }

}

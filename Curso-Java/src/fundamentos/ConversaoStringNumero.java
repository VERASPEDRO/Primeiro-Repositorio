package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {


        String valor1 = JOptionPane.showInputDialog("digite um numero");
        String valor2 = JOptionPane.showInputDialog("Digite outro");

        System.out.println(valor1+ valor2);

        double numero1= Double.parseDouble(valor1);    ///converter de String para numero
        double numero2= Double.parseDouble(valor1);

        double soma = numero1 + numero2;
        System.out.println(soma);
    }
}

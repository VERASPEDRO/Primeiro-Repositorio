package fundamentos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class TiposString {
    public static void main(String[] args) {
        String p = "Pedro veras";
        System.out.println(p.concat("veras"));
        System.out.println(p + "veras");
        System.out.println(p.startsWith("Pedro"));
        System.out.println(p.toUpperCase());
        System.out.println(p.toLowerCase());
        System.out.println(p.endsWith("Pedro"));
        System.out.println(p.equalsIgnoreCase("pedro veras"));
        System.out.println(p.length());
        System.out.println("pedro".charAt(0));
        var nome = "pedro";
        var sobrenome =  "veras";
        var idade = 27;
        var  salario =12345;
        System.out.printf("nome: %s %s %s", nome, sobrenome, idade, salario);
        System.out.println("pedro");



    }
}
package fundamentos;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.format.DateTimeFormatter;
public class TiposPrimitivos {
    public static void main(String[] args) {
        //informaçoes funcionarios
        // Tipos Numericos
        byte anosDeEmpresa = 32;
        short numerosDeVoos = 542;
        int id = 56789;
        long PontosAcumulados = 2_134_845_223;


        //Tipos Numerico Reais
        Float salario = 11_445.44F;
        Double VendasAcumuladas = 2_991_797_103.01;

        //Tipos booleano
        boolean estaDeFerias = true;

        //Tipo caractere
        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        System.out.println(numerosDeVoos /2 );
        System.out.println(PontosAcumulados / VendasAcumuladas);
        System.out.println("ferias:" + estaDeFerias);
        System.out.println("status" + status);
        System.out.println(id + ":ganha-> "+  salario);

    }
}

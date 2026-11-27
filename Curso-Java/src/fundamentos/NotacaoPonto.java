package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {
        String p = "Pedro Ramos";
        p = p.replace("Ramos","Veras");
        p = p.toUpperCase();
        p = p .concat("!!!");

        System.out.println(p);
        System.out.println(p.concat("Getulio"));
        System.out.println(p.toLowerCase());
    }
}


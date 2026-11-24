package fundamentos;

public class DesafiosAritimeticos {

    public static void main(String[] args) {

        double numeA = Math.pow(6 * (3+2),2);
        double denA = 3 * 2;
        double numeB = (1 - 5) * (2 - 7);
        double denoB = 2;

        double superA = numeA / denA;
        double superB = Math.pow(numeB / denoB,2);

        double superior  = Math.pow(superA-superB,3);
        double inferior = Math.pow(10,3);

        double resultado = superior / inferior;

        System.out.println("o resultado e: " + resultado);

    }
}

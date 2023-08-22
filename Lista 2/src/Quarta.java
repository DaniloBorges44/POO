import java.util.Scanner;

public class Quarta {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double peso  = entrada.nextDouble();
        double pag = peso * 12;
        
        System.out.println("O valor a ser pago é R$"+ pag);
    }
}

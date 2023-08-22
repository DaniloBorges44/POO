import java.util.Scanner;

public class Primeira {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);

        int pao  = entrada.nextInt();
        int broa = entrada.nextInt();
        
        double total = (pao * 0.12)+(broa * 1.50);
        double poup = total * 0.10;

        System.out.println("Foram arrecadados no total R$ "+total+", e deverá ser guardado na polpança R$"+poup);
    }
}

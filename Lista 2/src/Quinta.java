import java.util.Scanner;

public class Quinta {
    static void calculaFuncao(int x) {
    System.out.println((x*x)+(4*x)+2);
  }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int x  = entrada.nextInt();
        
        calculaFuncao(x);
    }
}

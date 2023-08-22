import java.util.Scanner;

public class terceira {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double preco  = entrada.nextDouble();
        double pag = entrada.nextDouble();
        double gasolina = pag/preco;

        System.out.println("Foi possivel abastecer o carro com "+gasolina+" litros");
    }
}


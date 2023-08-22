import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nome  = entrada.nextLine();
        int idade = entrada.nextInt();
        idade = idade * 365;

        System.out.println(nome+", você já viveu "+idade+" dias");
    }
}

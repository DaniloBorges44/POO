import java.util.Scanner;

public class sexta {
    static void cadastroFuncional(String nome, int idade, String telefone) {
    System.out.println("Nome: "+nome);
    System.out.println("idade: "+idade);
    System.out.println("Telefone: "+telefone);
    }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("escreva o seu nome");
        String nome  = entrada.nextLine();

        System.out.println("escreva o seu telefone");
        String telefone = entrada.nextLine();

        System.out.println("escreva sua idade");
        int idade  = entrada.nextInt();
        
        cadastroFuncional(nome,idade,telefone);
    }
}

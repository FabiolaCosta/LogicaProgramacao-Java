import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
        //Atividade 3
        int idade;
        String nome;
        
        System.out.println("\n Ativ 3\n Informe seu nome:");
        nome = teclado.nextLine();
        System.out.println("Informe a sua idade:");
        idade = teclado.nextInt();
        System.out.println("Olá " + nome + " você tem " + idade + " anos");
    }
}
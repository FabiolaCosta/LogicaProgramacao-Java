import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Atividades Java\n");
        
        //Atividade 2
        String nome;
        System.out.println("Ativ 2\n Digite seu nome");
        nome = teclado.nextLine();
        System.out.println("Olá " + nome);
    }
}
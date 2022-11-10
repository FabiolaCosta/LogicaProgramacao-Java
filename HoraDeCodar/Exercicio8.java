import java.util.Scanner;

public class Exercicio8{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
        //Atividade 8
        System.out.println("Ativ 7\n");
        double n1, n2, div;
        
        System.out.println("Informe o 1° número:");
        n1 = teclado.nextDouble();
        System.out.println("Informe o 2° número:");
        n2 = teclado.nextDouble();

        while(n2 <=0){
        System.out.println("Por favor, informe um número maior que 0\n Informe o 2° número novamente:");
        n2 = teclado.nextDouble();
        }

        div = n1 / n2;
        System.out.println("O resultado da divisão é: " + div);
    }
}

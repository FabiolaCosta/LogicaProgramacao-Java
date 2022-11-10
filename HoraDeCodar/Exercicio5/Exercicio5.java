import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Atividade 5
        System.out.println("Ativ 5\n Lendo números negativos e positvos\n");
        int numero;
        System.out.println("Informe um número:");
        numero = teclado.nextInt();
        if(numero == 0){
        System.out.println("Este número é igual a zero");
        }
        else if(numero <0){
        System.out.println("Este número é negativo: " + numero);
        }
        else{
        System.out.println("Este número é positivo: " + numero);
        }
    }
}
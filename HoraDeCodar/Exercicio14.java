import java.util.Scanner;

public class Exercicio14{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ativ 14\n");
        int n1, n2, acum = 0, calc = 0;

        System.out.println("Informe o primeiro número");
        n1 = teclado.nextInt();
        
        System.out.println("Informe o primeiro número");
        n2 = teclado.nextInt();

        while(n1 <= n2){
            acum = acum + n1;
            n1++;
            calc++;
        }
        System.out.println("O resultado é: " + acum/calc);
    }
}
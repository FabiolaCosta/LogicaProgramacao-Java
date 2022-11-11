import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ativ 13\n");
        int i = 15, acumuladora = 0, cont = 0;

        while(i < 100) {
            i++;
            acumuladora+= i;
            cont++;
        }
        System.out.println("A média é " + (acumuladora/cont));
    }
}
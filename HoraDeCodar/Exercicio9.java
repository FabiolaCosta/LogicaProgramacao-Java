import java.util.Scanner;

public class Exercicio9{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ativ 9\n");
        int num = 0, i, result;
        for(i=1; i<11; i++){
            System.out.println("Informe o " + i +"°" + "número");
            num = teclado.nextInt();
            num = num + i;
        }
        result = num / 10;
        System.out.println("A média é " + result);
    }
}
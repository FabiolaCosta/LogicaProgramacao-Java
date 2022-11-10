import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
         //Atividade 6
        System.out.println("Ativ 6\n");
        int n1, n2, n3;
        System.out.println("Informe o 1° número");
        n1 = teclado.nextInt();
        System.out.println("Informe o 2° número");
        n2 = teclado.nextInt();
        System.out.println("Informe o 3° número");
        n3 = teclado.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O maior número é " + n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("O maior número é " + n2);
        }
        else{
            System.out.println("O maior número é " + n3);
        }

        //Outra forma de fazer
        //int resultado = Math.max(n1, Math.max(n2, n3));
        //System.out.println("O maior número é " + resultado);
    }
}
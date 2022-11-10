import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ativ 7\n");
        int n1, n2, n3, soma;
        System.out.println("Informe o 1° número");
        n1 = teclado.nextInt();
        System.out.println("Informe o 2° número");
        n2 = teclado.nextInt();
        System.out.println("Informe o 3° número");
        n3 = teclado.nextInt();

        if(n1 > n3 && n2 > n3){
            soma = n1 + n2;
            System.out.println("A soma dos números maiores são: " + soma);
        }
        else if(n2 > n1 && n3 > n1){
            soma = n2 + n3;
            System.out.println("A soma dos números maiores são: " + soma);
        }
        else{
            soma = n3 + n1;
            System.out.println("A soma dos números maiores são: " + soma);
        }

        //Outra forma de fazer
        /*int menor = Math.min(n1, Math.min(n2, n3));
        soma = n1 + n2 + n3;
        System.out.println("A soma dos números maiores são: " + (soma - menor));*/

    }
}
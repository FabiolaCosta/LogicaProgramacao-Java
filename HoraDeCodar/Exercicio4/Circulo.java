import java.util.Scanner;

public class Circulo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
        //Atividade 4
        System.out.println("Calculando a área de um Círculo\n");
        double area, pi = 3.14, r;
        System.out.println("Informe o valor do raio:");
        r = teclado.nextDouble();
        area = pi * (r * r) ;
        System.out.println("O valor da área é: " + area);
    }
}
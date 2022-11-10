import java.util.Scanner;

public class Paralelogramo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
        //Atividade 4
        System.out.println("Calculando a área de Paralelogramo\n");
        double area, base, altura;
        System.out.println("Informe o valor da base:");
        base = teclado.nextFloat();
        System.out.println("Informe o valor da altura");
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println("O valor da área é: " + area);
    }
}
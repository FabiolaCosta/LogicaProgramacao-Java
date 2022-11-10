import java.util.Scanner;

public class Trapezio{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
         //Atividade 4
        System.out.println("Calculando a área de Trapézio\n");
        double area, baseMaior, baseMenor, h;
        System.out.println("Informe o valor da base maior:");
        baseMaior = teclado.nextFloat();
        System.out.println("Informe o valor da base menor:");
        baseMenor = teclado.nextFloat();
        System.out.println("Informe o valor da altura:");
        h = teclado.nextFloat();
        area = (baseMaior + baseMenor) * h /2;
        System.out.println("O valor da área é: " + area);
    }
}
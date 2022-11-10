import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
       //Atividade 4
        System.out.println("Calculando a área de um Quadrado\n");
        double area, lado;
        System.out.println("Informe o valor da base: \n");
        lado = teclado.nextFloat();
        area = lado * lado;
        System.out.println("O valor da área é: " + area);
    }
}
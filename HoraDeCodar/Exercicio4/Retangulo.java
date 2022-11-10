import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
       //Atividade 4
        System.out.println("Calculando a área de um Retângulo\n");
        double area, base, altura;

        System.out.println("Informe o valor da base: \n");
        base = teclado.nextFloat();
        System.out.println("Informe o valor da altura: \n");
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println("O valor da área é: " + area);
    }
}
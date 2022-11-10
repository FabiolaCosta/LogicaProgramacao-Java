import java.util.Scanner;

public class Losango{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Atividades Java\n");
       //Atividade 4
        System.out.println("Calculando a área de um Losango\n");
        double area, dgMaior, dgMenor;
        System.out.println("Informe o valor da diagonal maior\n");
        dgMaior = teclado.nextFloat();
        System.out.println("Informe o valor da diagonal menor");
        dgMenor = teclado.nextFloat();
        area = dgMaior * dgMenor / 2;
        System.out.println("O valor da área é: " + area);
    }
}
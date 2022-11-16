import java.util.Scanner;

public class Exercicio15{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Ativ 15\n");
        double n1, n2, media = 0;
        int cont = 0;
        String conf;

        do{
            System.out.println("Informe a primeira nota:");
            n1 = teclado.nextDouble();
            System.out.println("Informe a segunda nota:");
            n2 = teclado.nextDouble();

            media = (n1 + n2)/2;

            if(media >= 9.5){
                System.out.println("Aluno aprovado com a média: " + media + "\n");
                cont+=1;
            }
            else{
                System.out.println("Aluno reprovado com a média: " + media + "\n");
            }
            System.out.println("Deseja calcular a média de outro aluno S/N?\n");
            conf = teclado.next();
        }
        while(conf.equals("S") || conf.equals("s"));
    }
}
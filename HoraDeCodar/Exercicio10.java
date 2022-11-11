import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Atividade 10
        System.out.println("Ativ 10\n");
    
        int[] notas = new int[4];
        int media = 0, soma = 0;
        
        for(int i=0; i< notas.length; i++){
            System.out.println("Informe a nota:");
            notas[i] = teclado.nextInt();
            soma += notas[i];
        }
        media = soma/4;

        if(media >= 6){
            System.out.println("\nPARABÉNS! Você foi aprovado!" + "Com a média: " + media);
        }
        else{
            System.out.println("\nVocê foi reprovado!" + "Com a média: " + media);
        }
    }
}
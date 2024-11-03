package PastaConteudos.Conteudos.Atv4;

import java.util.Scanner;

public class FiveVetor {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o número do vetor " + (i+1) + ": ");
            
            vetor[i] = Scanner.nextInt();

            soma += vetor[i];
        }

        System.out.println("A soma dos vetores é igual a " + soma);
    
        Scanner.close();
    }
}

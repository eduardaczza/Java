package PastaConteudos.Conteudos.Atv4;

import java.util.Scanner;

public class SixVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];
    
        System.out.println("Digite a seguir seis vetores");

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o número do vetor " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length / 2; i++){
                int posicao = vetor[i];
                vetor[i] = vetor[vetor.length - i - 1];
                vetor[vetor.length - i - 1] = posicao;
        }

        System.out.println("Vetor invertido: ");
        for (int num : vetor){
            System.out.println(num + " ");
        }

    scanner.close();
    }
}

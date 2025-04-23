package PastaConteudos.Conteudos.Atv4;

import java.util.Scanner;

public class TwoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int [2][2];
        int [][] matriz1 = new int [2][2];
        int [][] matrizSoma = new int [2][2];

        System.out.println("Digite os valores para a matriz a seguir");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("Digite os primeiros elementos [" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores para outra matriz a seguir");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("Digite o primeiro elemento [" + i + "][" + j + "]");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                matrizSoma[i][j] = matriz[i][j] + matriz1[i][j];
            }
        }

        System.out.println("A soma da matriz resultante é:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

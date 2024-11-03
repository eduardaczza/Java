package PastaConteudos.Conteudos.Atv4;

import java.util.Scanner;

public class Matriz {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][2];

        System.out.println("Digite os valores para a matriz 3x2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizT = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        // Imprimindo a  transposta
        System.out.println("A matriz transposta é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println();
        }

    scanner.close();
    }
}

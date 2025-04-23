package PastaConteudos.Conteudos.Atv4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SixVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];

        try {
            System.out.println("Digite a seguir seis números:");

            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            // Invertendo o vetor
            for (int i = 0; i < vetor.length / 2; i++) {
                int temp = vetor[i];
                vetor[i] = vetor[vetor.length - i - 1];
                vetor[vetor.length - i - 1] = temp;
            }

            // Imprimindo o vetor invertido
            System.out.println("Vetor invertido:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida! Por favor, digite apenas números inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro de índice do vetor. Verifique o tamanho do vetor e os índices utilizados.");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

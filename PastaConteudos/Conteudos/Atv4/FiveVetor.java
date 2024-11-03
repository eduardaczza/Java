package PastaConteudos.Conteudos.Atv4;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FiveVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        try {
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
                soma += vetor[i];
            }
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida! Por favor, digite apenas números inteiros.");
        } catch (NoSuchElementException e) {
            System.err.println("Fim de arquivo inesperado. Verifique a entrada.");
        } finally {
            scanner.close();
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

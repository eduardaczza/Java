package Aula2;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zero = 1;
        int soma = 0;
        while (zero > 0) {
            System.out.println("Digite apenas números inteiros: ");
            int numero = scanner.nextInt();
           
            if (numero ==0) {
                break;
            }
            soma += numero;

        }
        System.out.println("A soma dos números digitados é " + soma);
     scanner.close();
    }
}

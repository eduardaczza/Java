package Aula2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação (1 - soma, 2 - subtração, 3 - divisão, 4 - multiplicação): ");
        int operacao = scanner.nextInt();

        System.out.println("Digite o número para obter sua tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            switch (operacao) {
                case 1:
                    System.out.println(num + " + " + i + " = " + (num+i));
                    break;
                case 2: 
                System.out.println(num + " - " + i + " = " + (num-i));
                break;
                case 3:
                    if (i != 0) {
                        System.out.println(num + " / " + i + " = " + (num / (double) i));
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                case 4: 
                    System.out.println(num + " x " + i + " = " + (num * i));
                default:
                    System.out.println("Operação inválida.");
            }
        }
        scanner.close();
     }
}


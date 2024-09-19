package Aula2;

import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        System.out.println("Digite o primero lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 ||lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isosceles.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Seu triângulo é equilatro.");
        } else {
            System.out.println("Seu triângulo é escaleno");
        }

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            int triangulo = (lado1 == lado2 ? 1 : 0) + (lado2 == lado3 ? 2 : 0) + (lado1 == lado3 ? 4 : 0);

            switch (triangulo) {
                case 3:
                    System.out.println("O triângulo é equilátero.");
                    break;
                case 1:
                case 2:
                case 4:
                    System.out.println("O triângulo é isósceles.");
                    break;
                default:
                    System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo válido.");
        }

        while (continuar) {
            System.out.println("Digite o primero lado do triângulo: ");
        double ladoT1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        double ladoT2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        double ladoT3 = scanner.nextDouble();

        if (ladoT1 == ladoT2 ||ladoT2 == ladoT3 || ladoT1 == ladoT3) {
            System.out.println("O triângulo é isosceles.");
        } else if (ladoT1 == ladoT2 && ladoT2 == ladoT3) {
            System.out.println("Seu triângulo é equilatro.");
        } else {
            System.out.println("Seu triângulo é escaleno");
        }
         
        System.out.print("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
    
        }
        scanner.close();
    }
 }

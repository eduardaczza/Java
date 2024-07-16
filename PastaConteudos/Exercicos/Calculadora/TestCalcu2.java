package PastaConteudos.Exercicos.Calculadora;

import java.util.Scanner;

public class TestCalcu2 {
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);
        
        int num;

        do {
            System.out.println("Digite um número positivo.");
            num = Scanner.nextInt();

            if (num<0) {
                System.out.println("Número inválido, tente novamente.");
            }
        } while(num<0);
        System.out.println(Calcu.fatorial(num));


        Scanner.close();

    }
}


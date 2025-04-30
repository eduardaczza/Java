package PastaConteudos.Conteudos.Exceptions;

import java.util.Scanner;

public class Throws {

    public static void main(String[] args) {
        System.out.println("Digite um numero decimal ");

        try {
            double num = lerNumero();   
            System.out.println("Voce digitou: " + num);       

        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }
        
    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
        return num;
    }
    
}

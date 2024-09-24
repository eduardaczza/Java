package PastaConteudos.Conteudos.Aula1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        //data de nascimento
        System.out.println("Digite sua data de nascimento (DD-MM-AAAA): ");
        String dataNasc = scanner.next();

        LocalDate dataNascimento = LocalDate.parse(dataNasc);   
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataNascimento, hoje);
        int calculadorIdade = periodo.getYears();

        if (calculadorIdade < 18) {
            System.out.println("Você é menor de idade.");
        } else { 
            System.out.println("Você é maior de idade.");
        }

        scanner.close();
    }
}

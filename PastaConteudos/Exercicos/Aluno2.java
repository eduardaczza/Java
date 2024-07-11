package PastaConteudos.Exercicos;

import java.util.Scanner;

public class Aluno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.next();

        System.out.println("Digite o nome do curso: ");
        aluno.nomeCurso = scanner.next();

        System.out.println("Digite o número da matrícula: ");
        aluno.matricula = scanner.next();

        //aluno.nmDisciplinas = new String[3];  //instanciando o array
        for (int i = 0; i<aluno.nmDisciplinas.length; i++){
            System.out.println("Digite o nome da disciplina: " + i);
            aluno.nmDisciplinas[i] = scanner.next();
        }

        for (int i = 0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nmDisciplinas[i]);
           
            for (int j = 0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota: " + (j+1));
                aluno.notasDisciplinas[i][j] = scanner.nextDouble();
            }
        }
        
        aluno.mostrarInfo();

        for (int i =0; i<aluno.nmDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nmDisciplinas[i] + " - foi aprovado.");
            } else {
                System.out.println("Disciplina " + aluno.nmDisciplinas[i] + " - foi reprovadoDu.");
            }
        }

        scanner.close();
    }
}
